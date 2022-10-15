package resources;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class MyFirstServlet extends HttpServlet {
 
  private static final long serialVersionUID = -1915463532411657451L;
 
  @Override
  protected void doGet(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException 
  {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    boolean success = validateUser(username, password);

    try {
      // Write some content
      out.println("<html>");
      out.println("<head>");
      out.println("<title>LoginServlet</title>");
      out.println("</head>");
      out.println("<body>");
    
      if(success) {
        out.println("<h2>Welcome Friend</h2>");
      }else{
        out.println("<h2>Validate your self again.</h2>");
      }

      out.println("</body>");
      out.println("</html>");
    } catch (NullPointerException e){ // alínea i)
      System.err.println(e);
      System.exit(-1);
    } finally {
      out.close();
    }
  }
   
  //@Override
  //protected void doPost(HttpServletRequest request,
  //    HttpServletResponse response) throws ServletException, IOException {
  //  //Do some other work
  //}
 
}