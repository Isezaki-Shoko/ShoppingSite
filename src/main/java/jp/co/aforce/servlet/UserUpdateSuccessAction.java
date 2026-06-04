package jp.co.aforce.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UsersDAO;
import tool.Action;

public class UserUpdateSuccessAction extends Action {

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

        UsersDAO dao = new UsersDAO();

        int result = dao.update(user);

        if (result > 0) {

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            request.setAttribute("message", "会員情報を更新しました");
            return "/views/user-update-success.jsp";
        }

        request.setAttribute("message", "更新に失敗しました");
        return "/views/user-update.jsp";
    }
}