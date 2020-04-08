package com.example;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String name = req.getParameter("name");

        if (name == null || name.length() == 0) {
            name = "world";
        }

        resp.getWriter().print("<html>\n" +
                "<body>\n" +
                "<h1>Hello, " +
                name +
                "!</h1>\n" +
                "<p>This is a test page.</p>\n" +
                "</body>\n" +
                "</html>");
    }
}
