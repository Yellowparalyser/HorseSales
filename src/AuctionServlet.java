import model.Horse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/auction")
public class AuctionServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList <Horse> horses = new ArrayList();

        //request.setCharacterEncoding("UTF-8");

        for(int i=1;i<=4;i++) {
            if(request.getParameter("horse" + i)!="" && request.getParameter("price" + i)!="") {
                Horse horse = new Horse(request.getParameter("horse" + i),request.getParameter("price" + i));
                horses.add(horse);
            }
        }


        if (horses.size() ==0) {
            request.getRequestDispatcher("noauction.jsp").forward(request, response);
            getServletContext().getRequestDispatcher("/noauction.jsp").forward(request,response);
        }else{
            //PrintWriter writer = response.getWriter();
            //writer.println("Licytowane przez Ciebie konie:");
            //for ( int i=0; i <= horses.size()-1; i++){
              // writer.println(horses.get(i).getName());
            // }
            // writer.println("Suma licytacji: " + Calculator.calculateSum(horses));
            //writer.println("Średnia licytowana przez Ciebie kwota : " + Calculator.calculateAverage(horses));

            request.setAttribute("horses",horses);
            request.setAttribute("sum", Calculator.calculateSum(horses));
            request.setAttribute("avg", Calculator.calculateAverage(horses));
            request.getRequestDispatcher("auction.jsp").forward(request, response);
            getServletContext().getRequestDispatcher("/auction.jsp").forward(request,response);
        }



    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
