package com.self;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by haoxiuqing on 2017/5/7.
 */
public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long start = System.currentTimeMillis();
        // 设置响应内容类型
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        //PrintWriter out = response.getWriter();
        //out.println("<h1>" + 123 + "</h1>");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
