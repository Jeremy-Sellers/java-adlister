import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class pizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher view = request.getRequestDispatcher("/pizza-order.jsp");
        view.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Assigns the value in *name* from pizza-order.jsp for each value chosen by user and submitted
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
        String[] toppings = request.getParameterValues("toppings");

        //Allows value to be used in Expression Language in jsp and sets to whatever value is placed in second parameter
        request.setAttribute("crust",crust);
        request.setAttribute("sauce",sauce);
        request.setAttribute("size",size);
        request.setAttribute("toppings",toppings);
        request.setAttribute("address",address);
        //passes the flow of control from servlet to jsp
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }
}