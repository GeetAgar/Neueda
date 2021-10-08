

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;

/**
 * Servlet implementation class Withdrawl
 */
@WebServlet("/Withdrawl")
public class Withdrawl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Withdrawl() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Login l = new Login();
	
		member m = new member(l.accno, l.pin);
		String am = request.getParameter("amm");
		WithdrawlDAO w = new WithdrawlDAO();
		
		int a = w.check(m,am);
		
		if(a == 1)
		{
			int count[] = w.withdraw(m,am);
			int eur[] = {50, 20, 10, 5};
			String arr[] = new String[4];  
			for(int i =0; i<4; i++)
			{
				int c = eur[i]*count[i];
				arr[i]= eur[i]+" * "+count[i]+" = "+c;
			}
			
			request.setAttribute("arr",arr);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request,response);
		}
		else
		{
			response.sendRedirect("Withdrawlerror.jsp");
		}
		
		//response.sendRedirect("balance.jsp");
	}


}
