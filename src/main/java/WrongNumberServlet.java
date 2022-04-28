import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Step 4
//logic for if guess is incorrect
@WebServlet(name = "WrongGuess", urlPatterns = "/incorrect")
public class WrongNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //sets result to false
        req.setAttribute("result",false);
        //gives control to guess-result.jsp
        req.getRequestDispatcher("guess-result.jsp").forward(req,resp);
    }
}

