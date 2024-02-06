package com.example.Springimage.service;

import org.springframework.web.multipart.MultipartFile;

public interface ServicesFile {
	String uploadimage(String path, MultipartFile file);

}
