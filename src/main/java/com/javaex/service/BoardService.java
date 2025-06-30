package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.BoardRepository;
import com.javaex.vo.BoardVO;

@Service
public class BoardService {

	//필드
	@Autowired
	private BoardRepository boardRepository;	
	
	//메소드일반
	//--게시판 전체 리스트
	public List<BoardVO> exeList(){
		System.out.println("BoardService.exeList()");
		
		List<BoardVO> boardList = boardRepository.boardSelectList();
		System.out.println(boardList);
		
		return boardList;
	}
	
	//글쓰기  -->  세션저장용
	public BoardVO exeWriting(BoardVO boardVO) {
		System.out.println("BoardService.exeWriting()");

		boardRepository.boardSelectOne(boardVO); 
	
		BoardVO board02 = boardRepository.boardSelectOne(boardVO);

		return board02; 
	}
	
	//게시판 수정폼
	public BoardVO exeEditeForm(int no) {
		System.out.println("BoardService.exeEditeForm(수정폼)");
		
		BoardVO boardVO =boardRepository.boardSelectByNo(no);
		
		return boardVO;
	}	
	
	//게시판 수정
	public int exeEdite(BoardVO boardVO) {
		System.out.println("BoardService.exeEdite(수정)");
		
		int i = boardRepository.boardUpdate(boardVO);
		
		return i;
	}
	
}
