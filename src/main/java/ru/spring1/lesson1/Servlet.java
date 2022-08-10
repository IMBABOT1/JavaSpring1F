package ru.spring1.lesson1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class Servlet extends HttpServlet {

    private List<Product> list;

    @Override
    public void init() throws ServletException {
        list = new ArrayList<>();
        list.add(new Product(1, "first", 10));
        list.add(new Product(2, "second", 20));
        list.add(new Product(3, "third", 300));
        list.add(new Product(4, "fourth", 40));
        list.add(new Product(5, "fifth", 50));
        list.add(new Product(6, "six", 60));
        list.add(new Product(7, "seven", 70));
        list.add(new Product(8, "eight", 80));
        list.add(new Product(9, "nine", 90));
        list.add(new Product(10, "ten", 100));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < list.size(); i++) {
            resp.getWriter().printf("<h1>" + list.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }
}
