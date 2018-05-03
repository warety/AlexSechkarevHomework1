package controller;

import model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class ItemController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListItems list = new ListItems();
        HttpSession session = request.getSession(true);
        request.setAttribute("list", list.getItemList());
        request.setAttribute("order", session.getAttribute("order"));
        request.getRequestDispatcher("/WEB-INF/views/itemList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListItems list = new ListItems();
        ListOrederAndItems listOrederAndItems = new ListOrederAndItems();
        HttpSession session = request.getSession(true);
        Order order = (Order) session.getAttribute("order");


        request.setAttribute("order", order);

        String[] added = request.getParameterValues("itemValue");
        request.setAttribute("aaa", added[0]);
//        int a;
//        for (int i=0; i<added.length; i++){
//            a = Integer.parseInt(added[i]);
//            request.setAttribute("bbb", a);
//            //listOrederAndItems.addOrderAndItemsList(new OrderAndItems(i,added[i], order));
//        }
        request.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(request, response);
    }


}
