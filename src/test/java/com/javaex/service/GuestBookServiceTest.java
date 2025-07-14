package com.javaex.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaex.vo.GuestbookVO;

@SpringBootTest
public class GuestBookServiceTest {

	@Autowired
	private GuestbookService guestbookService;
	
	@Test
	public void delete() {
		GuestbookVO guestBookVO = new GuestbookVO();
		guestBookVO.setNo(1);
		guestBookVO.setPassword("123");
	
		int count = guestbookService.exeGuestbookRemove(guestBookVO);
		
		assertThat(count).isEqualTo(0);

	}
}
