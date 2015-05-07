package com.sds.icto.guestbook.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDao;
import com.sds.icto.web.Action;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		request.setCharacterEncoding( "utf-8" );

			String no = request.getParameter( "no" );
			String password = request.getParameter( "password" );
			Long noLong = Long.parseLong(no);
			
			GuestBookDao dao = new GuestBookDao();
			
			dao.delete( noLong, password );
			
		response.sendRedirect( "/guestbook2/gb" );
		
	}
	
}
