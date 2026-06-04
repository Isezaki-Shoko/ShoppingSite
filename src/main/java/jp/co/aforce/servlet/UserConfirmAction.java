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

            String pattern = "^[a-zA-Z0-9]{8,16}$";
            
            if (memberId == null || memberId.isEmpty()
                    || password == null || password.isEmpty()
                    || lastName == null || lastName.isEmpty()
                    || firstName == null || firstName.isEmpty()
                    || address == null || address.isEmpty()
                    || mailAddress == null || mailAddress.isEmpty()) {

                request.setAttribute("message", "すべての項目を入力してください");
                return "/views/user-add.jsp";
            }


            if (!memberId.matches(pattern)) {
                request.setAttribute("message",
                    "会員IDは半角英数字8～16文字で入力してください。");
                return "/views/user-add.jsp";
            }if (!password.matches(pattern)) {
                request.setAttribute("message",
                        "パスワードは半角英数字8～16文字で入力してください。");
                    return "/views/user-add.jsp";
                }
            if (memberId.equals(password)) {
                request.setAttribute(
                    "message",
                    "会員IDとパスワードは同じにできません。");
                return "/views/user-add.jsp";
            }

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

