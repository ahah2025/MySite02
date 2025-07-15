package com.javaex.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AttachService {

	//필드
	
	//생성자 메소드gs
	
	//메소드일반
	public void exeUpload(MultipartFile file){
		System.out.println("AttachService.exeUpload()");
		
		//-------(1)파일정보를 추출 DB에 저장
		//오리지널 파일명 
		String orgName = file.getOriginalFilename();
		System.out.println(orgName);
		//확장자
				
		//저장파일명(덮어쓰기 방지용)
		
		//파일경로(C드라이브)
		
		//파일사이즈		
		
		
		
		//-------(2)실물파일을 하드디스크에 저장
		
		
		
		
	}	
}
