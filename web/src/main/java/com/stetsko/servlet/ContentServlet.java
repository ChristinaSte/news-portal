package com.stetsko.servlet;

import com.stetsko.entity.Content;
import com.stetsko.service.ContentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    private ContentService contentService = ContentService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.valueOf(req.getParameter("id"));
        Optional<Content> content = contentService.find(id);
        if (content.isPresent()) {
            req.setAttribute("content", content.toString());
            req.getServletContext()
                    .getRequestDispatcher(".WEB-INF/jsp/content.jsp")
                    .forward(req, resp);
        }
    }
}