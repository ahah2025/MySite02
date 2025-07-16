package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GalleryService;
import com.javaex.vo.GalleryVO;

@Controller
@RequestMapping(value="/gallery")
public class GalleryController {

	//필드
	@Autowired
	private GalleryService galleryService;
	
	//갤러리 전체 리스트
	@RequestMapping(value={"","/","/list"}, method={RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("GalleryController.list()");
		
		List<GalleryVO> list = galleryService.exeGetGalleryList();
		
		model.addAttribute("gallerylist", list);
		
		return "gallery/list";
	}
	
	//--이미지 저장
	@RequestMapping(value="/add", method= {RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute GalleryVO galleryVO) {
		System.out.println("GalleryController.add()");
		
		galleryService.exeGalleryAdd(galleryVO);
		System.out.println(galleryVO);
		
		return "gallery/list";
	}	
	
}
