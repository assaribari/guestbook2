package com.sds.icto.guestbook.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException, IOException {
		
		WebUtil.forward("/view/index.jsp", request, response);
		
	}
	
}
