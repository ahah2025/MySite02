package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	//필드
	@Autowired
	private UserService userService;
	
	//메소드일반
	//--회원가입폼
	@RequestMapping(value="/user/joinform", method = {RequestMethod.GET, RequestMethod.POST}   )
	public String joinForm() {
		System.out.println("UserController.joinForm()");
		
		return "user/joinForm";
	}
	
	//--회원가입
	@RequestMapping(value="/user/join", method = {RequestMethod.GET, RequestMethod.POST})
	public String join(@ModelAttribute UserVO userVO) {
		System.out.println("UserController.join()");
		
		try {
			userService.exeJoin(userVO);
			return "user/joinok";
			
		}catch(DuplicateKeyException e) {
			System.out.println(e);
			System.out.println("중복아이디");
			return "redirect:/user/joinform";
			
		}catch (Exception e) {
			System.out.println(e);
			return "redirect:/user/joinform";
		}
		
	}
	
	//--로그인폼
	@RequestMapping(value="/user/loginform", method= {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginForm()");
		
		return "user/loginForm";
	}
	
	
	//--로그인
	@RequestMapping(value = "/user/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@ModelAttribute UserVO userVO, HttpSession session) {
		System.out.println("UserController.login()");
		
		UserVO authUser = userService.exeLogin(userVO);
		System.out.println(authUser);
		
		//세션영역에 확인용 값을 넣어준다  --> 로그인
		session.setAttribute("authUser", authUser);
		
		return "redirect:/";
	}
	
	//--로그아웃
	@RequestMapping(value="/user/logout", method= {RequestMethod.GET, RequestMethod.POST})
	public String logout(HttpSession session) {
		System.out.println("UserController.logout()");
	
		// 세션의 확인용 값을 지운다
		// session.removeAttribute("authUser");
		session.invalidate();
		
		return "redirect:/";
	}	
	
	
	//--회원정보수정폼
	@RequestMapping(value="/user/editform", method= {RequestMethod.GET, RequestMethod.POST})
	public String editForm(HttpSession session, Model model) {		
		System.out.println("UserController.EditForm()");
		
		//로그인 했는지 안했는지
		
		
		//세션에서 no값을 가져온다(지금 접속한(로그인된) 사용자의 no 값)
		//*파라미터로 안 받고 왜 세션에서 꺼내쓸까??????????
		UserVO authUser = (UserVO)session.getAttribute("authUser");
		int no = authUser.getNo();
				
		//no를 서비스에 넘겨서 no회원의 정보를 useVO 형태로 받는다
		UserVO userVO = userService.exeEditForm(no);
		
		//userVO 모델에 담는다 --> 0.5 request 어트리뷰트에 넣어라
		model.addAttribute("userVO", userVO);
		
		return "user/editForm";
	}
	
	//--회원정보 수정
	@RequestMapping(value="/user/edit", method={RequestMethod.GET, RequestMethod.POST})
	public String edit(@ModelAttribute UserVO userVO, HttpSession session) {
		System.out.println("UserController.edit()");
		
		//0. DS가 파라미터 값을 묶어서 준다
		
		//1. 세션에서 no값을 꺼내온다
		UserVO authUser = (UserVO)session.getAttribute("authUser");
		int no = authUser.getNo();
		
		//2. DS가 묶어준 userVO레 세션에서 꺼낸 no를 추가한다
		userVO.setNo(no);
		
		//3.서비스에 묶어둔 userVO를 넘긴다
		userService.userUpdate(userVO);
		
		
		return 0;
	}
	
}
