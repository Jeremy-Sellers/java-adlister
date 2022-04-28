import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
//urlPatterns is used in color-picker.jsp action=" ";
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher view = request.getRequestDispatcher("/color-picker.jsp");
        view.forward(request,response);
        //Passes control to color-picker.jsp
    }

    //post method sent from color-picker.jsp so doPost logic is what is being used
    //Step 2
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //sets color from name=*color* in color-picker.jsp
        String color = request.getParameter("color");

        //javier solution

        String url = "/viewcolor?color=" + color;
        response.sendRedirect(url);
        //calls on logic in ViewColorServlet by using the urlPatterns value and adding onto it with necessary code + user input

        //javier solution
    }
}
