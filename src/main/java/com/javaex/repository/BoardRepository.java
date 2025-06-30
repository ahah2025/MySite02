package com.javaex.repository;

import java.util.List;

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
	//-- 전체리스트 가져오기(게시판리스트)
	public List<BoardVO> boardSelectList() {
		System.out.println("BoardRepository.boardSelectList()");
		
		List<BoardVO> boardList = sqlSession.selectList("board.selectList");
		
		return boardList;
	}
	
	//--board 정보 가져오기
	public BoardVO boardSelectOne(BoardVO boardVO) {
		System.out.println("BoardRepository.boardSelectOne");
		
		BoardVO board02 = sqlSession.selectOne("board.selectOne", boardVO);  
		
		return board02;
	}
	
	//board 정보 가져오기(no) --> 수정폼
	public BoardVO boardSelectByNo(int no) {
		System.out.println("BoardRepository.boardSelectByNo()");
		
		BoardVO boardVO = sqlSession.selectOne("board.boardSelectByNo", no);
		
		return boardVO;
		
	}	
	
	//board 정보 수정
	public int boardUpdate(BoardVO boardVO) {
		System.out.println("BoardRepository.boardUpdate");
		
		int i = sqlSession.update("board.update",boardVO);
		
		return i;
	}
	
	
}
