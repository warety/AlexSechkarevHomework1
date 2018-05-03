package controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class WebController extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        PrintWriter printWriter = null;
        try
        {
            printWriter = response.getWriter();
        }
        catch (Exception ex)
        {
        }


        try
        {
            response.setContentType("text/html;charset=Windows-1251");

            HttpSession session = request.getSession(true);
            Object nn = session.getAttribute("n");
            int n = 0;
            if (nn!=null)
            {
                n = ((Integer)nn).intValue();
            }
            n=n+1;

            //session.setAttribute("n",new Integer(n))

            request.setAttribute("n",""+n+":: "+Thread.currentThread());


            String view = "main";
            request.getRequestDispatcher("/WEB-INF/views/"+view+".jsp").forward(request,response);
        }
        catch (Exception ex)
        {
            printWriter.println("Error: "+ex.getMessage());
        }
    }
}