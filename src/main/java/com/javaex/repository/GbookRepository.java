package com.javaex.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GbookVO;

@Repository
public class GbookRepository {

	//필드
	@Autowired
	private SqlSession sqlSession;
	
	//메소드일반
	//--방명록 제목(title), 내용(content), 작성자(writer)를 작성한 뒤 등록 가능

	//제목(title), 내용(content), 작성자(writer)등록
	public int guestbookInsert(GbookVO gbookVO){
		System.out.println("GbookRepository.guestbookInsert");
		
		return 0;
	}
			
	//-- 조회
	public int gbReadList(GbookVO gbookVO) {
		System.out.println("GbookRepository.gbReadList");
		
		return 0;
	}
	
	//--수정
	public int guestbookWhite(GbookVO gbookVO) {
		System.out.println("GbookRepository.guestbookWhite");
		
		return 0;
	}
	
}
