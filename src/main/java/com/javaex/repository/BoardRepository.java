package com.javaex.repository;
//Repository(DAO)는 커리문 하나만 시킨다

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BoardVO;

@Repository
public class BoardRepository {

	//필드
	@Autowired
	private SqlSession sqlSession;	
	
	//메소드일반
	//--전체리스트 가져오기(게시판리스트)
	public List<BoardVO> boardSelectList() {
		System.out.println("BoardRepository.boardSelectList()");

		List<BoardVO> boardList = sqlSession.selectList("board.selectList");

		return boardList;
	}

	//--전체리스트 가져오기2(페이징)
	public List<BoardVO> boardSelectList2(Map<String, Integer> limitMap) {
		System.out.println("BoardRepository.boardSelectList2()");
		
		System.out.println(limitMap);
		
		return null;
	}
	
	
}
