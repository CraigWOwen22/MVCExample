package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class MVCPatternDemo {

    public static void main(String[] args) {
            Student model = retrieveStudentFromDatabase();

            StudentView view = new StudentView();

            StudentController controller = new StudentController(model, view);

            controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Dion");
        student.setRollNo("11");
        return student;
    }
}
