import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//obsługa żądania i wysłanie odpowiedzi
//lub logowanie informacji w konsoli
        System.out.println("Request to /hello received ");

        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("imie");
        String lastName = request.getParameter("nazwisko");
        System.out.println(firstName + " " + lastName);
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Hello " + firstName + " " + lastName);

    }
}
