package com.example.Springimage.controller;

	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Springimage.payload.FileResponse;
import com.example.Springimage.service.ServicesFile;

	//@RestController
//	@RequestMapping("/api")
	/*public class ControllerImage {
		@Autowired
		private ServicesFile fileService;
		
		@Value("${project.image}")
		private String path;
		
	    @PostMapping("/im")
	    public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image){
	   String fileName=null;
	    	try {
	    	fileName = this.fileService.uploadimage(path, image);
			
		} catch (Exception e) {
			e.printStackTrace();
        return new ResponseEntity<>(new FileResponse(null, "image not uploaded due to error"),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    	
	    	return new ResponseEntity<>(new FileResponse(fileName, "image is successgully upload"),HttpStatus.OK);
	    }
	   
	    
	}
*/
	@RestController
	@RequestMapping("/api")
	public class ControllerImage {

	    @Autowired
	    private ServicesFile fileService;

	    @Value("${project.image}")
	    private String path;

	    @PostMapping("/upload-image")
	    public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image) {
	        try {
	            String fileName = fileService.uploadimage(path, image);
	            return new ResponseEntity<>(new FileResponse(fileName, "Image successfully uploaded"), HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ResponseEntity<>(new FileResponse(null, "Image not uploaded due to an error"), HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	}
	
	


