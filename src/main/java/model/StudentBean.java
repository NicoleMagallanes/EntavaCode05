package model;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;

public class StudentBean {
    String name,studentID, remarks;
    double midterm, prefinal, finalGrade;
ServletConfig config;
    public StudentBean(){}

    public StudentBean(String name, String studentID, double midterm, double prefinal) {
        this.name= name;
        this.studentID = studentID;
        this.midterm =midterm;
        this.prefinal = prefinal;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public double getMidterm() {
        return midterm;
    }

    public void setMidterm(double midterm) {
        this.midterm = midterm;
    }

    public double getPrefinal() {
        return prefinal;
    }

    public void setPrefinal(double prefinal) {
        this.prefinal = prefinal;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double computeFinalGrade() {
        this.finalGrade = (0.5*this.midterm)+ (0.5*this.prefinal);
        return 0;
    }

    public void determineRemarks() {
        this.remarks = (this.finalGrade < 60) ? "You Failed":"You Passed";
    }
}
