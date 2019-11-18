package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String output = "Exam Scores:";

        for (int i = 1; i <= getNumberOfExamsTaken(); i++) {
            output += "\n\tExam " + i + " -> " + examScores.get(i - 1);
        }
        return output;
    }

    public void addExamScore(Double score) {
        examScores.add(score);
    }

    public void setExamScore(Integer examNum, Double replacementScore) {
        examScores.set(examNum - 1, replacementScore);
    }

    public Double getStudentAverageExamScore() {
        Double total = 0.0;
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            total += examScores.get(i);
        }
        return total / getNumberOfExamsTaken();
    }

    @Override
    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() + "\n" +
                "> Average Score: " + getStudentAverageExamScore() + "\n> " + getExamScores();
    }



}
