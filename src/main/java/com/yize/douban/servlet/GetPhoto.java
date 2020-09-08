package com.yize.douban.servlet;

import com.yize.douban.module.CelebrityPhoto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetPhoto extends HttpServlet {
    private static CelebrityPhoto celebrityPhoto;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/json;charset=utf-8");

        PrintWriter writer = response.getWriter();
        String photoId = request.getParameter("id");
        String start = request.getParameter("start");
        String count = request.getParameter("count");
        if(celebrityPhoto==null){
            celebrityPhoto=new CelebrityPhoto();
        }
        if(photoId==null||start==null||count==null){
            writer.write("{}");
        }else {
            writer.write(celebrityPhoto.requestCelebrityPhoto(photoId,start,count));
        }
        writer.flush();
        writer.close();


    }
}
