package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.GbookRepository;
import com.javaex.vo.GbookVO;

@Service
public class GbookService {
	
	//필드
	@Autowired
	private GbookRepository gbookRepository;
	
	//메소드일반
	//--main
	
	//--등록
	public int exegbAdd(GbookVO gbookVO) {
		System.out.println("GbookService.exegbAdd");
		
		return 0;
	}
	
	//--조회
	/*
	public GbookVO exegbRead(GbookVO gbookVO) {
		System.out.println("GbookService.exegbRead");
		
		//gbookRepository.(gbookVO);
		
		//gbookVO read= gbookRepository.(gbookVO);

		//return ;		
	}
	*/

	//--수정
	/*
	public GbookVO exegbWhite(GbookVO gbookVO) {
		System.out.println("GbookService.exegbWhite");
		
	}
	*/	
}
