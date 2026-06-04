package jp.co.aforce.servlet;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UsersDAO;
import tool.Action;

public class UserListAction extends Action{
		public String execute(
				HttpServletRequest request,
				HttpServletResponse response)
				throws Exception{
			
			UsersDAO dao =new UsersDAO();
			
			List<Users> list =dao.selectAll();
			
			request.setAttribute("list", list);
			
			return "/views/user-list.jsp";
		}
}