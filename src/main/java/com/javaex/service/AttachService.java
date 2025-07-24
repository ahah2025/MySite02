package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.vo.FileVO;

@Service
public class AttachService {

	//필드
	
	//생성자 메소드gs
	
	//메소드일반
	public String exeUpload(MultipartFile file){
		System.out.println("AttachService.exeUpload()");

		//파일저장경로
		//String saveDir = "C:\\JavaStudy\\upload\\"; local할때
		String saveDir = "/data/upload"; //리눅스 root 에 저장
		
		
		//-------(1)파일정보를 추출 DB에 저장
		//오리지널 파일명 
		String orgName = file.getOriginalFilename();
		System.out.println(orgName);   //JeonSoMin.jpg
		
		//확장자
		String exName = orgName.substring(orgName.lastIndexOf(".")+1); 
		System.out.println(exName);  //.jpg
		
		//저장파일명(겹치지 않는 파일명 - 덮어쓰기 방지용)
		String saveName = System.currentTimeMillis()+UUID.randomUUID().toString()+"."+exName;
		System.out.println(saveName);  //17525498730118e67697f-93fb-48c9-a3c9-8b1b39b2fba1.jpg 
		
		//파일경로(C드라이브)
		String filePath = saveDir+saveName;
		System.out.println(filePath);
		
		//파일사이즈		
		long filesize = file.getSize();		
		System.out.println(filesize);
		
		//vo에 묶는다  --> DB에 저장
		FileVO fileVO = new FileVO(orgName,exName,saveName,filePath,filesize);
		System.out.println(fileVO);
		
		//--> DB 저장
		//과제(주황색)
		
		
		//-------(2)실물파일을 하드디스크에 저장
		try {
			byte[] fileDate = file.getBytes();
			
			OutputStream os = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			bos.write(fileDate);
			bos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return saveName;
	}	
}
