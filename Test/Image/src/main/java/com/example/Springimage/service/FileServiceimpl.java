package com.example.Springimage.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceimpl implements ServicesFile{

	@Override
	public String uploadimage(String path, MultipartFile file) {
		//file name
		String name=file.getOriginalFilename();
		//fullpath
		String filepath=path+ File.separator+name;
		//create folder if not create
		
		File f=new File(path);
		if(!f.exists()) {
		f.mkdir();
			
		}
		
		//file copy
		try {
			Files.copy(file.getInputStream(), Paths.get(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}

}
