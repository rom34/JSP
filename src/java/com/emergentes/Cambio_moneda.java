package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cambio_moneda", urlPatterns = {"/Cambio_moneda"})
public class Cambio_moneda extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       try{ 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cambio de moneda</title>");            
            out.println("</head>");
            out.println("<body>");   
            out.println("<form action='' method='post'>");
            out.println("Ingresar moneda: ");
            out.println("<input type='text' name='val1' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("<br><br>");
            out.println("</form>");
       }finally{
           out.close();
       }
    }
  
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       Double num1,b,d;
       num1=Double.parseDouble(request.getParameter("val1")); 
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
     
        try{ 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            
           if(num1!=null){

                      b=num1*6.91;
                      d=num1*0.14;
                      out.println("Bolivianos: "+b + " Bs");
                      out.println("<br><br>");
                      out.println("Dolares : "+d + " $");
                    } else  {
                      out.println("No hay datos para mostrar");   
                    }
            out.println("</body>");
            out.println("</html>");
        } finally {
         out.close();
        }
    } 
}








      
    
