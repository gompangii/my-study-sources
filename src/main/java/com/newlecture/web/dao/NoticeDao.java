package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {

//	@Result(property = "regdate", column = "reg_date")
//	@Result(property = "memberName", column = "member_name")
//	@Results({
//		@Result(property = "regdate", column = "reg_date"),
//		@Result(property = "memberName", column = "member_name")
//	})
//	@Select("select * from noticeview")
//	List<NoticeView> getList();

//	List<NoticeView> getList(int offset, int size, String field, String query);
//	Notice get(int id);
	
	List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
	int getCount(String field, String query, boolean pub);
	NoticeView getView(int id);
	
	Notice getNext(int id);
	Notice getPrev(int id);
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);

	int deleteAll(int[] ids);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
}
