package com.sds.icto.guestbook.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDao;
import com.sds.icto.guestbook.vo.GuestBookVo;
import com.sds.icto.web.Action;

public class AddAction implements Action {
	
	// 이메일 등록
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
	
		request.setCharacterEncoding( "utf-8" );

		String name = request.getParameter( "name" );
		String password = request.getParameter( "pass" );
		String message = request.getParameter( "content" );
		
		GuestBookVo vo = new GuestBookVo();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMessage(message);
		
		GuestBookDao dao = new GuestBookDao();
		dao.insert( vo );

		response.sendRedirect( "/guestbook2/gb" ); 
		

	}
	
}
