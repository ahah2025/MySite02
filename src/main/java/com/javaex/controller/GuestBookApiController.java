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
import com.javaex.util.JsonResult;
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
	public JsonResult list() {
		System.out.println("GuestbookApiController.list");
		
		List<GuestbookVO> guestbookList = guestbookService.exeGetGuestbookList();
		System.out.println(guestbookList);
		
		if(guestbookList != null) {
			return JsonResult.success(guestbookList);
		}else {
			return JsonResult.fail("알수 없는 오류");
		}
	}

	//--방명록저장
	@PostMapping("/api/guestbooks")
	public JsonResult add(@ModelAttribute GuestbookVO guestbookVO) {
		System.out.println("GuestbookApiController.add()");
		
		//guestbookVO(3) --> gVO(4, 출력용)
		GuestbookVO gVO= guestbookService.exeGuestbookAddKey(guestbookVO);
		
		if(gVO != null) {
			return JsonResult.success(gVO);
		}else {
			return JsonResult.fail("저장 실패");
		}
		
	}
	
	//--방명록 삭제
	@DeleteMapping(value="/api/guestbooks/{number}")
	public JsonResult remove(@ModelAttribute GuestbookVO guestbookVO,
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
		
		if(count == 1) {
			return JsonResult.success(count);
		}else {
			return JsonResult.fail("패스워드 틀림");
		}
		
	}
	
}
