package jp.co.aforce.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Users;
import tool.Action;

public class UserUpdateConfirmAction extends Action {

    public String execute(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        Users user = new Users();

        user.setMemberId(request.getParameter("memberId"));
        user.setPassword(request.getParameter("password"));
        user.setLastName(request.getParameter("lastName"));
        user.setFirstName(request.getParameter("firstName"));
        user.setAddress(request.getParameter("address"));
        user.setMailAddress(request.getParameter("mailAddress"));

        request.setAttribute("user", user);

        return "/views/user-update-confirm.jsp";
    }
}