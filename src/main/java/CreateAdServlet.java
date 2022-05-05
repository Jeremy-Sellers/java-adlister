import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Forwards control to create.jsp
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);
    }

    //Logic to create new ad
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //new ad created using fields from create.jsp form for ads
        Ad ad = new Ad(
                1, // hardcoded user id
                request.getParameter("title"),
                request.getParameter("description")
        );
        //ad created from form gets passed to insert method from MySQLAdsDao.java
        DaoFactory.getAdsDao().insert(ad);
        //redirects to ads page at end
        response.sendRedirect("/ads");
    }
}