import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//Step 2
@WebServlet(name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/guessing-game.jsp");
        view.forward(request,response);
    }

    //Step 3
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //generate random number between 1 and 3
        int randomNumber = (int) (Math.random() * 3 + 1);
        //retrieves user guessed number
        int guessedNumber = Integer.parseInt(req.getParameter("guess"));

        //logic if guess is correct or incorrect redirects to different pages
        if (guessedNumber == randomNumber){
            resp.sendRedirect("/correct");
        }else{
            resp.sendRedirect("/incorrect");
        }
    }
}
