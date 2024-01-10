package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="responseHeaderServlet",urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // status line
        response.setStatus(HttpServletResponse.SC_OK);

        // response headers
        response.setHeader("Content-Type","text/plain");
        response.setHeader("Cache-Control","no-cache, no-store, must-validate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("my-header","hello");

        // 메세지 바디
        response.getWriter().write("ok");

        content(response);
        cookie(response);
        redirect(response);
    }

    private static void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/basic/hello-form.html");
    }

    private static void cookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie","good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    private static void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
    }
}
