package jp.co.aforce.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("/views/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        HttpServletResponse res =
                (HttpServletResponse) response;

        // キャッシュ無効
        res.setHeader(
                "Cache-Control",
                "no-cache, no-store, must-revalidate");

        res.setHeader("Pragma", "no-cache");
        res.setDateHeader("Expires", 0);

        String path = req.getRequestURI();

        // 未ログインでもアクセス可能なページ
        if (path.endsWith("login-in.jsp")
                || path.endsWith("login-error.jsp")
                || path.endsWith("register.jsp")
                || path.endsWith("logout-out.jsp")) {

            chain.doFilter(request, response);
            return;
        }

        HttpSession session = req.getSession(false);

        Object user = null;

        if (session != null) {
            user = session.getAttribute("user");
        }

        // 未ログインならログイン画面へ
        if (user == null) {
            res.sendRedirect(
                    req.getContextPath()
                    + "/views/login-in.jsp");
            return;
        }

        chain.doFilter(request, response);
    }
}

