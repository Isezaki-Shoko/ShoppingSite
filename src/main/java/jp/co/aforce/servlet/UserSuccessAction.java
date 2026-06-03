package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UsersDAO;
import tool.Action;

public class UserSuccessAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Users user = new Users();

        try {
            request.setCharacterEncoding("UTF-8");

            user.setMemberId(request.getParameter("memberId"));
            user.setPassword(request.getParameter("password"));
            user.setLastName(request.getParameter("lastName"));
            user.setFirstName(request.getParameter("firstName"));
            user.setAddress(request.getParameter("address"));
            user.setMailAddress(request.getParameter("mailAddress"));

            UsersDAO dao = new UsersDAO();
            int result = dao.insert(user);

            if (result == 1) {
                return "/views/user-add-success.jsp";
            }

            request.setAttribute("message", "会員登録に失敗しました。");
            request.setAttribute("user", user);
            return "/views/user-add.jsp";

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", e.getClass().getName() + " : " + e.getMessage());
            request.setAttribute("user", user);
            return "/views/user-add.jsp";
        }
    }
}