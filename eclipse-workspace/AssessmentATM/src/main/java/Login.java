import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static String accno;
    public static String pin;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		accno = request.getParameter("accno");
		pin = request.getParameter("pin");
		
		member m = new member(accno, pin);
		LoginDAO ld = new LoginDAO();
		int f = ld.cred(m);
		if(f ==1 )
		{
			HttpSession session = request.getSession();
			session.setAttribute("accno", accno);
			session.setAttribute("pin", pin);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("loginerror.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
