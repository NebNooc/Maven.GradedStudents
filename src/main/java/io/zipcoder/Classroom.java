package io.zipcoder;

public class Classroom {

    private Student[] students;
    public Integer maxNumberOfStudents;

    public Classroom(Integer max) {
        this.students = new Student[max];
        maxNumberOfStudents = max;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getClassAverageExamScore() {
        Double total = 0.0;

        for(int i = 0; i < students.length; i++) {
            total += students[i].getStudentAverageExamScore();
        }
        return total / students.length;
    }

    public void addStudent(Student student) {
        students = new Student[maxNumberOfStudents];
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName) {

    }


}
