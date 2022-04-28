import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Step 4
//logic for if guess is correct
@WebServlet(name = "CorrectGuess", urlPatterns = "/correct")
public class CorrectNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //sets result to true
        req.setAttribute("result",true);
        //gives control to guess-result.jsp
        req.getRequestDispatcher("guess-result.jsp").forward(req,resp);
    }
}
