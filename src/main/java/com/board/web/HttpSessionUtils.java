package com.board.web;

import javax.servlet.http.HttpSession;

import com.board.domain.User;

public class HttpSessionUtils {
	public static final String USER_SESSION_KEY = "sessionedUser";
	
	public static boolean isLoginUser(HttpSession session) {
		Object sessionedUser = session.getAttribute(USER_SESSION_KEY);
		if(sessionedUser == null) {
			return false;
		}
		return true;
	}
	
	public static User getUserFormSession(HttpSession session) {
		if(!isLoginUser(session)) {
			return null;
		}
		
//		User sessionedUser = (User)session.getAttribute(USER_SESSION_KEY);
//		return sessionedUser;
		return (User)session.getAttribute(USER_SESSION_KEY);
	}

}
