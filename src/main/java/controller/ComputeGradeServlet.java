package controller;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.StudentBean;

@WebServlet(name = "computegradeservlet", value = "/computegradeservlet")
public class ComputeGradeServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String studentID = request.getParameter("id");
        double midterm = Double.parseDouble(request.getParameter("midterm"));
        double prefinal = Double.parseDouble(request.getParameter("prefinal"));

StudentBean student = new StudentBean(name, studentID, midterm, prefinal);
student.computeFinalGrade();
student.determineRemarks();

    }

    public void destroy() {
    }
}