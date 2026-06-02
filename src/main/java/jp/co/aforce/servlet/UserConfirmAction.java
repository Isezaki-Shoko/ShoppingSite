package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Users;
import tool.Action;

public class UserConfirmAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setCharacterEncoding("UTF-8");

            String memberId = request.getParameter("memberId");
            String password = request.getParameter("password");
            String passwordConfirm = request.getParameter("passwordConfirm");
            String lastName = request.getParameter("lastName");
            String firstName = request.getParameter("firstName");
            String address = request.getParameter("address");
            String mailAddress = request.getParameter("mailAddress");

            if (password == null || !password.equals(passwordConfirm)) {
                request.setAttribute("message", "パスワードが一致しません。");
                return "/views/user-add.jsp";
            }

            Users user = new Users();
            user.setMemberId(memberId);
            user.setPassword(password);
            user.setLastName(lastName);
            user.setFirstName(firstName);
            user.setAddress(address);
            user.setMailAddress(mailAddress);

            request.setAttribute("user", user);

            return "/views/user-add-confirm.jsp";

        } catch (Exception e) {
            e.printStackTrace();
            return "/views/user-add.jsp";
        }
    }
}