package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.BoardService;
import com.javaex.vo.BoardVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {

	//필드
	@Autowired
	private BoardService boardService;
	
	//메소드일반
	
	//--게시판 전체 리스트
	@RequestMapping(value="/board/list",method= {RequestMethod.GET, RequestMethod.POST} )
	public String list(Model model) {
		System.out.println("BoardController.list()");
		
		List<BoardVO> boardList = boardService.exeList();
		System.out.println(boardList);
		
		model.addAttribute("boardList", boardList);
		
		return "board/list";
	}
	
	//글쓰기 폼
	@RequestMapping(value="/board/writeform", method= {RequestMethod.GET, RequestMethod.POST})
	public String WritingForm() {
		System.out.println("BoardController.writeform");
		
		return "board/writeForm";
	}
	
	//글쓰기
	@RequestMapping(value = "/board/writing", method = { RequestMethod.GET, RequestMethod.POST })
	public String Writing(@ModelAttribute BoardVO boardVO, HttpSession session) {
		System.out.println("boardController.Writing()");
		
		BoardVO board01 = boardService.exeWriting(boardVO);
		System.out.println(board01);
		
		session.setAttribute("board01", board01);
		
		return "redirect:/";		
	}
	
	//보기  --- 에러... 정상페이지가 아님
	@RequestMapping(value = "/board/read", method = { RequestMethod.GET, RequestMethod.POST })
	public String read(@ModelAttribute BoardVO boardVO, HttpSession session) {
		System.out.println("boardController.read()");
		
		BoardVO board02 = boardService.exeWriting(boardVO);
		System.out.println(board02);
		
		session.setAttribute("board02", board02);
		
		return "board/editform";		
	}	
	
	//삭제 --- 정상적으로 보임
	@RequestMapping(value="/board/remove",method={RequestMethod.GET,RequestMethod.POST})
	public String remove() {
		System.out.println("boardController.remove");
		
		return "guestbook/removeform";	
	}
	
	//수정폼
	@RequestMapping(value="/board/editeform", method= {RequestMethod.GET, RequestMethod.POST})
	public String editeForm(HttpSession session, Model model) {		
		System.out.println("BoardController.editeForm()");
		
		//세션에서 no값을 가져온다
		BoardVO board01 = (BoardVO)session.getAttribute("board01");
				
		if(board01 == null) {
			
			return "guestbook/removeform";
		
		}else { 

			int b01 = board01.getNo();
			
			BoardVO boardVO = boardService.exeEditeForm(b01);
			
			//boardVO 모델에 담는다 --> D.S야 request의 어트리뷰트에 넣어라
			model.addAttribute("BoardVO", boardVO);
		}
		
		return "board/editform";
	}
		
	
	//수정
	@RequestMapping(value = "/board/edite", method={RequestMethod.GET,RequestMethod.POST})
	public String edite(@ModelAttribute BoardVO boardVO, HttpSession session) {
		System.out.println("BoardController.edite()");
		
		BoardVO board01 = (BoardVO)session.getAttribute("board01");
		int i = board01.getNo();
		
		boardVO.setNo(i); 
		
		boardService.exeEdite(boardVO);
		
		board01.setUserName(boardVO.getUserName());
		
		return "redirect:/";
	}

}
