package com.javaex.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GalleryVO;

@Repository
public class GalleryRepository {
	
	//필드
	@Autowired
	private SqlSession sqlSession;
	
	// 전체데이터 가져오기
	public List<GalleryVO> gallerySelect() {
		System.out.println("GalleryRepository.gallerySelect()");
		
		List<GalleryVO> alist = sqlSession.selectList("gallery.selectList");
		
		return alist;
	}
	
	// 저장하기
	public int galleryInsert(GalleryVO galleryVO) {
		System.out.println("GalleryRepository.galleryInsert()");
		
		int img = sqlSession.insert("gallery.insert", galleryVO);
		
		return img;
	}	
	
}
