package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calcular_edad", urlPatterns = {"/Calcular_edad"})
public class Calcular_edad extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
     
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='' method='get' >");
            out.println("Año de nacimiento:");
            out.println("<input type ='text' name='val1' value=''>");
            out.println("<br><br>");
            out.println("Año actual: ");
            out.println("<input type ='text' name='val2' value=''>");
            out.println("<br><br>");
            out.println("<input type ='submit' value='Calcular'>");
            out.println("</form>");
                  if(request.getParameter("val1")!=null && request.getParameter("val2")!=null){
                      Integer num1,num2,r;
                      num1=Integer.parseInt(request.getParameter("val1"));
                      num2=Integer.parseInt(request.getParameter("val2"));
                      r=num2-num1;
                      out.println("<br>Su edad es  " +r + " años");
                  } else {
                      out.println("");   
                    }
            out.println("</body>");
            out.println("</html>");
        }finally {
         out.close();
    }
    }       
}
