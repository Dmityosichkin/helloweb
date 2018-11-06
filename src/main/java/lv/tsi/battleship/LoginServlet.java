package lv.tsi.battleship;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("User is trying to login");
        String name = request.getParameter ( "username");
        String pass = request.getParameter("pwd");
        System.out.println("User is trying to login:" + name);
        System.out.println("Password:" + pass);

        if ("12345".equals(pass)) {
            request.getRequestDispatcher("/WEB-INF/success.jsp")
                    .include(request, response);
        } else {
                response.sendRedirect("fail.jsp");
            }
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
