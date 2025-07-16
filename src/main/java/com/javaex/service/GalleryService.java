package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.GalleryRepository;
import com.javaex.vo.GalleryVO;

@Service
public class GalleryService {

	//필드
	@Autowired
	private GalleryRepository galleryRepository;
	
	//-전체갤러리 리스트 가져오기
	public List<GalleryVO> exeGetGalleryList(){
		System.out.println("GalleryService.exeGetGalleryList()");
		
		List<GalleryVO> gaList = galleryRepository.gallerySelect();
		
		return gaList;
	}
	
	//--이미지 저장하기
	public int exeGalleryAdd(GalleryVO galleryVO) {
		System.out.println("GalleryService.exeGalleryAdd()");
		
		int imagesave = galleryRepository.galleryInsert(galleryVO);
		
		return imagesave;
		
	}	
	
}
