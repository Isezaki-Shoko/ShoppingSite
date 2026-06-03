package jp.co.aforce.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UsersDAO;
import tool.Action;

public class UserDeleteAction extends Action {

    public String execute(
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

        HttpSession session = request.getSession();

        Users user =
            (Users)session.getAttribute("user");

        UsersDAO dao = new UsersDAO();

        int count =
            dao.delete(user.getMemberId());

        if(count > 0){

            session.invalidate();

            return "/views/user-delete-success.jsp";
        }

        request.setAttribute(
            "message",
            "退会処理に失敗しました。");

        return "/views/delete-confirm.jsp";
    }
}