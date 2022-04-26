import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/count")
public class PageCounterServlet extends HttpServlet {

    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counter += 1;
        if (request.getParameter("reset") != null){
            counter = 1;
        }
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}
