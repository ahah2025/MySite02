package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GbookService;

@Controller
@RequestMapping(value="/main")
public class GBmainController {

	//필드
	@Autowired
	private GbookService gbookService;	
	
	
	//--1 방명록 번호(no),제목(title), 작성자(writer), 등록 날짜(regDate)
	//--2 페이징 처리, 한 페이지당 10개의 방명록 출력(내림차순)
	//--3 방명록 번호(no) 클릭 시 조회 페이지로 이동
	//--4 방명록 등록 버튼을 누르면 등록을 위한 페이지 이동
	//--5 제목(title), 내용(content), 작성자(writer)를 조합하여 방명록 검색 가능
	
	//메소드일반
	//--방명록 메인 페이지
	@RequestMapping(value="/gbookmain", method = {RequestMethod.GET, RequestMethod.POST}   )
	public String add() {
		System.out.println("GBmainController.Gbookmain(main화면)");
		
		return "";
	}

	





}
