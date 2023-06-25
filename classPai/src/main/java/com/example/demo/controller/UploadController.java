package com.example.demo.controller;

import com.example.demo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;


    @PostMapping("/upload")
    public String[] uploadFile(@RequestParam(value = "files") List<MultipartFile> files,@RequestParam(value = "oldFiles") List<String> oldFiles, HttpServletRequest request) throws IOException {
        return this.uploadService.uploadFile(files,oldFiles,request);
    }
}
