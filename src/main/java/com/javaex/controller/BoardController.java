package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.BoardService;
import com.javaex.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	//필드
	@Autowired
	private BoardService boardService;
	
	//메소드일반
	
	//--게시판 전체 리스트
	@RequestMapping(value="/list",method= {RequestMethod.GET, RequestMethod.POST} )
	public String list(Model model) {
		System.out.println("BoardController.list()");
		
		List<BoardVO> boardList = boardService.exeList();
		System.out.println(boardList);
		
		model.addAttribute("boardList", boardList);
		
		return "board/list";
	}
	
	//--게시판 전체 리스트2(페이징)
	@RequestMapping(value="/list2", method= {RequestMethod.GET, RequestMethod.POST})
	public String list2(@RequestParam(value="crtpage", required = false, defaultValue = "1") int crtPage,
						Model model ) {
		System.out.println("BoardController.list2()");

		Map<String, Object> pMap = (Map<String, Object>) boardService.exeList2(crtPage);

		model.addAttribute("pMap", pMap);
		System.out.println(pMap);


		return "board/list2";
	}

	
	//--게시판 전체 리스트3(페이징)
	@RequestMapping(value="/list3", method= {RequestMethod.GET, RequestMethod.POST})
	public String list3(@RequestParam(value="crtpage", required = false, defaultValue = "1") int crtPage, 
						@RequestParam(value="kwd", required = false, defaultValue = "") String kwd,
						Model model ) {
		System.out.println("BoardController.list3()");
		
		Map<String, Object> pMap = boardService.exeList3(crtPage, kwd);
		System.out.println("-------------------------------");
		System.out.println(pMap);
		System.out.println("-------------------------------");
		
		
		model.addAttribute("pMap", pMap);

		return "board/list3";
	}	
	
	
	//글쓰기 폼
	/*
	@RequestMapping(value="/board/writeform", method= {RequestMethod.GET, RequestMethod.POST})
	public String WritingForm() {
		System.out.println("BoardController.writeform");
		
		return "board/writeForm";
	}
	*/
	
	//글쓰기

	
	//삭제 --- 정상적으로 보임
	/*
	@RequestMapping(value="/board/remove",method={RequestMethod.GET,RequestMethod.POST})
	public String remove() {
		System.out.println("boardController.remove");
		
		return "guestbook/removeform";	
	}
	
	
	//수정폼
	/*
	@RequestMapping(value="/board/editeform", method= {RequestMethod.GET, RequestMethod.POST})
	public String editeForm(HttpSession session, Model model) {		
		System.out.println("BoardController.editeForm()");
		
		//세션에서 no값을 가져온다
		BoardVO board01 = (BoardVO)session.getAttribute("board01");
				
		if(board01 == null) {
			
			return "guestbook/removeform";
		
		}else { 

						
			//boardVO 모델에 담는다 --> D.S야 request의 어트리뷰트에 넣어라
			model.addAttribute("BoardVO");
		}
		
		return "board/editform";
	}
	*/	
	
	//수정

}
