package controller;

import model.Item;
import model.Order;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class OrderController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Order order = new Order();
        request.setAttribute("order", order);
        request.getRequestDispatcher("/WEB-INF/views/itemList.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);


        Order order = new Order();
        order.setId(2);

        //request.setAttribute("order", order);
        session.setAttribute("order",order);
        request.getRequestDispatcher("/WEB-INF/views/order.jsp").forward(request, response);
    }
}
