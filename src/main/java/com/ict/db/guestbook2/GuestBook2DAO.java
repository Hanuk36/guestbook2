package com.ict.db.guestbook2;

import org.apache.ibatis.session.SqlSession;

public class GuestBook2DAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = GuestBook2DBService.getFactory().openSession();
		}
		return ss;
	}
	
	//All list
	
	//One list
	
	//insert
	
	//delete
	
	//update
	
	
	
	
	
	
}
