package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
     
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operaciones</title>");            
            out.println("</head>");
            out.println("<body>");
             if(request.getParameter("val1")!=null && request.getParameter("val2")!=null){
                      Integer num1,num2,s,r,d,m;
                      num1=Integer.parseInt(request.getParameter("val1"));
                      num2=Integer.parseInt(request.getParameter("val2"));
                      s=num1+num2;
                      r=num1-num2;
                      d=num1/num2;
                      m=num1*num2;
       
                      out.println("la suma es: "+ s );
                      out.println("la resta es: "+ r );
                      out.println("la division es: "+ d );
                      out.println("la multiplicacion es: "+ m );
                  } else {
                      out.println("");   
                    } 
      
            out.println("<form action='' method='get' >");
            out.println("introducir numero: ");
            out.println("<input type ='text' name='val1' value=''>");
            out.println("<br>");
            out.println("introducir numero: ");
            out.println("<input type ='text' name='val2' value=''>");
            out.println("<br>");
            out.println("<select id='lista' name='lista'>");
            out.println("<option>operadores</option>");
            out.println("<option value='s'>sumar</option>");
            out.println("<option value='r'>restar</option>");
            out.println("<option value='m'>multiplicar</option>");
            out.println("<option value='d'>dividir</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type ='submit' value='procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }finally {
         out.close();
    }
}
}


 
