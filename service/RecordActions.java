package service;

import model.Student;

public interface RecordActions {
    void addStudent(Student student);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, String course, double marks);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}
