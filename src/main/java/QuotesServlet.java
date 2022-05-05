import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuotesServlet", value = "/quotes")
public class QuotesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Quotes quotesDao = DaoFactory.getQuotesDao();
        List<Quote> quotes = quotesDao.all();

        request.setAttribute("quotes",quotes);
        request.getRequestDispatcher("/WEB-INF/quotes/quotes.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
