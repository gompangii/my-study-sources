package com.newlecture.web.controller.admin.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

import java.util.List;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	@RequestMapping("list")
	public String list() {
		
		List<NoticeView> list = service.getViewList(true);
		
		return "admin.board.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		NoticeView notice = service.getView(1);
		
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		
		return "admin.board.notice.reg";
	}
}
