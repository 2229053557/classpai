package com.example.demo.service.impl;

import com.example.demo.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class UploadServiceBean implements UploadService {
    static String urlString = "http://localhost:8081/homework/";
    public String[] uploadFile(List<MultipartFile> files, List<String> oldFiles,HttpServletRequest request) {
        try {
            int size = 0;
            if(files!=null){
                size = files.size();
            }
            int oldSize = 0;
            if(oldFiles!=null){
                oldSize = oldFiles.size();
            }
            String[] filesName = new String[size+oldSize];
            if(filesName.length>0){
                int i =0;
                if(oldSize>0){
                    for(i = 0;i<oldSize;i++){
                        filesName[i] = oldFiles.get(i);
                    }
                }
                if(size>0){
                    for(MultipartFile file :files) {
                        String oldName = file.getOriginalFilename();
                        String realPath = new String((ResourceUtils.getURL("classpath:").getPath()+"static/homework").getBytes("utf-8"),"ISO-8859-1");
                        String newName = UUID.randomUUID().toString().substring(0,7) + "_" + oldName;
                        File folder = new File(realPath, newName);
                        if (!folder.exists()) {
                            folder.mkdirs();
                        }
                        file.transferTo(folder);
                        filesName[i]=(urlString+folder.getName());
                        i++;
                    }
                }
            }

            return filesName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}