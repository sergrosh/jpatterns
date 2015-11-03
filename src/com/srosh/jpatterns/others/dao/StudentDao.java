package com.srosh.jpatterns.others.dao;
import java.util.List;
/**
 * Created by sroshchupkin on 15/09/15.
 */


public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
