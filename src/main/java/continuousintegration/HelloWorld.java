package continuousintegration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import continuousintegration.service.HelloWorldService;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet { 
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException 
	{
		// reading the user input
		String color= request.getParameter("color"); 
		int a = new Integer(request.getParameter("a")).intValue();
		int b = new Integer(request.getParameter("b")).intValue();
		HelloWorldService helloWorldService = new HelloWorldService();
		boolean returnVal =helloWorldService.equalityCheck(a, b);
		PrintWriter out = response.getWriter();
		System.out.println("hello world");
		if(returnVal)
		{
			out.println (
					"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
							"<html> \n" +
							"<head> \n" +
							"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
							"<title> My first jsp  </title> \n" +
							"</head> \n" +
							"<body> \n" +
							"<font size=\"12px\" color=\"" + color + "\">" +
							"Hello World" +
							"</font> \n" +
							"</body> \n" +
							"</html>"  
					);
		}
		else
		{
			out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
					"<html> \n" +
					"<head> \n" +
					"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
					"<title> My first jsp  </title> \n" +
					"</head> \n" +
					"Hello World no color change" +
					"</font> \n" +
					"</body> \n" +
					"</html>");
		}
	}  
}