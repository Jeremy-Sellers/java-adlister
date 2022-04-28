import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Step 3
@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //receives color from color-picker?
        String color = request.getParameter("color");

        //sets color from user to color value
        request.setAttribute("color",color);

        //Gives control to color-viewer.jsp
        RequestDispatcher view = request.getRequestDispatcher("/color-viewer.jsp");
        view.forward(request,response);
    }

}
