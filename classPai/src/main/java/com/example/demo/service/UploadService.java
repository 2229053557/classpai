package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UploadService {

    public String[] uploadFile(List<MultipartFile> files, List<String> oldFiles,HttpServletRequest request);

}
