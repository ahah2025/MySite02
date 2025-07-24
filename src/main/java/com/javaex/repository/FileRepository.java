package com.javaex.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.javaex.vo.FileVO;

public class FileRepository {

	//필드
	@Autowired
	private SqlSession sqlSession;	
	
	//저장하기
	public int fileAdd(FileVO fileVO) {
		System.out.println("FileRepository.fileAdd()");
		
		int f = sqlSession.insert("file.insert",fileVO);
		
		return f;
	}




}
