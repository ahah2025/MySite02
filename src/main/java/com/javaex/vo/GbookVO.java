package com.javaex.vo;

public class GbookVO {
	
	//필드
	private int gbno;
	private String title;   //제목
	private String writer;  //작성자
	private String regDate; //등록날짜
	private String content;

	//생성자
	public GbookVO() {	}

	public GbookVO(String title, String writer, String regDate, String content) {
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.content = content;
	}
	
	public GbookVO(int gbno, String title, String writer, String regDate, String content) {
		super();
		this.gbno = gbno;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.content = content;
	}

	//메소드gs
	public int getGbno() {
		return gbno;
	}

	public void setGbno(int gbno) {
		this.gbno = gbno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//메소드일반
	@Override
	public String toString() {
		return "GbookVO [gbno=" + gbno + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate
				+ ", content=" + content + "]";
	}

}
