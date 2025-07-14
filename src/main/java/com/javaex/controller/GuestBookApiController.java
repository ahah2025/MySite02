package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVO;

//데이타로 응답하는 애들
@RestController  //@Controller + ResponseBody 합쳐진 것!
public class GuestBookApiController {

	//필드
	@Autowired
	private GuestbookService guestbookService;
	
	/*
	http://localhost:8888/api/guestbook/list
						api:데이터만 받겠다
	*/
	
	//메소드
	//--전체리스트
	@GetMapping("/api/guestbooks")
	//@GetMapping(value="/api/guestbooks")
	public List<GuestbookVO> list() {
		System.out.println("GuestbookApiController.list");
		
		List<GuestbookVO> guestbookList = guestbookService.exeGetGuestbookList();
		System.out.println(guestbookList);
		
		return guestbookList;
	}

	//--방명록저장
	@PostMapping("/api/guestbooks")
	public GuestbookVO add(@ModelAttribute GuestbookVO guestbookVO) {
		System.out.println("GuestbookApiController.add()");
		
		//guestbookVO(3) --> gVO(4, 출력용)
		GuestbookVO gVO= guestbookService.exeGuestbookAddKey(guestbookVO);
	
		return gVO;
		
	}
	
	//--방명록 삭제
	@DeleteMapping(value="/api/guestbooks/{number}")
	public int remove(@ModelAttribute GuestbookVO guestbookVO,
					  @PathVariable(value="number")int number
			) {
		System.out.println("GuestbookApiController.remove()");
		//guestbookVO 패스워드 값만 있다
		System.out.println(guestbookVO);
		System.out.println("패스배리어블로 받은 값: " + number );
		
		//guestbookVO 에 number 값을 넣어준다
		guestbookVO.setNo(number);
		System.out.println(guestbookVO);
		
		int count = guestbookService.exeGuestbookRemove(guestbookVO);
		
		return count;
	}
	
}
