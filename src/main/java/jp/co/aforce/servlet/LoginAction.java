package jp.co.aforce.servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UsersDAO;
import tool.Action;


public class LoginAction extends Action{
	
	public String execute(
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

    
    	  HttpSession session = request.getSession();
            String memberId = request.getParameter("memberId");
            String password = request.getParameter("password");
           
            if("000".equals(memberId)&&"kanrisha333".equals(password)) {
            	session.setAttribute("admin",true);
            	
            	ServletContext app=request.getServletContext();
            
            	
            	HttpSession oldSession =(HttpSession)app.getAttribute(memberId);
            	
            	if(oldSession !=null) {
            	request.setAttribute("errorMsg", "このアカウントは別ブラウザでログインされています。");
            	
            	return "/views/login-error.jsp";
            	
            	}
            	
            	app.setAttribute(memberId, session);
            	session.setAttribute("admin",true);
            	return "/views/admin-menu.jsp";
            }
            
            
            UsersDAO dao = new UsersDAO();
            Users user = dao.search(memberId, password);
            if (user != null) {

                
                session.setAttribute("user", user);
                
                
                return "/views/user-menu.jsp";
            }
           
            return "/views/login-error.jsp";
            
    }
}
           