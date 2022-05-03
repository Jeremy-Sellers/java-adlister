import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //When a user visits /logout, they should be logged out of your application and redirected to the login page.
        request.getSession().invalidate();
        response.sendRedirect("/login");
    }
}
