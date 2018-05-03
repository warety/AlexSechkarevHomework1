package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 03.05.2018.
 */
public class FrontController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            FrontCommand command = getCommand(request);
            command.init(getServletContext(), request, response);
            command.process();
        }

    private FrontCommand getCommand(HttpServletRequest request) {
        try {
            Class type = Class.forName(String.format(
                             "controller.%sController",
                    request.getParameter("controller")));
            return (FrontCommand) type
                    .asSubclass(FrontCommand.class)
                    .newInstance();
        } catch (Exception e) {
            return new UnknownCommand();
        }
    }
}