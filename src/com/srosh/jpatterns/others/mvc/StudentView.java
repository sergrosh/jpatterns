package com.srosh.jpatterns.others.mvc;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
