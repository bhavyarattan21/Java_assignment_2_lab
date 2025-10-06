package service;

import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentManager implements RecordActions {
    private Map<Integer, Student> students = new HashMap<>();

    // Add student if rollNo is unique
    public void addStudent(Student student) {
        if (students.containsKey(student.getRollNo())) {
            System.out.println("Error: Duplicate roll number!");
            return;
        }
        students.put(student.getRollNo(), student);
        System.out.println("Student added successfully.");
    }

    public void deleteStudent(int rollNo) {
        if (students.remove(rollNo) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(int rollNo, String course, double marks) {
        Student s = students.get(rollNo);
        if (s != null) {
            s.setCourse(course);
            s.setMarks(marks);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public Student searchStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students.values()) {
            s.displayInfo();
        }
    }
}
