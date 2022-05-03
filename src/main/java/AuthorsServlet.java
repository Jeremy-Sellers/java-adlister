import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AuthorsServlet", value = "/authors")
public class AuthorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Create a new Dao that creates connection and gets driver loaded
        Authors authorsDao = new AuthorsDao();
        //returns arrayList of author objects
        List<Author> authors = authorsDao.all();
        //
        request.setAttribute("authors",authors);
        //forward request object to view
        request.getRequestDispatcher("/WEB-INF/quotes/authors.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
