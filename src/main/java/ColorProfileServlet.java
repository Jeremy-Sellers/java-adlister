import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ColorProfileServlet", urlPatterns = "/color-profile")
public class ColorProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("WEB-INF/color-profile.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        if (request.getParameter("forget") != null){
            session.removeAttribute("font-color");
            session.removeAttribute("bg-color");
            response.sendRedirect("/color-profile");
        } else {
            session.setAttribute("font-color",request.getParameter("font-color"));
            session.setAttribute("bg-color",request.getParameter("bg-color"));
            response.sendRedirect("/ads");
        }
    }
}
