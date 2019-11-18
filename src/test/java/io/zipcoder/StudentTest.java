package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        String expected =   "Exam Scores:\n"        +
                            "\tExam 1 -> 100.0\n"   +
                            "\tExam 2 -> 95.0\n"    +
                            "\tExam 3 -> 123.0\n"   +
                            "\tExam 4 -> 96.0";

        // When
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        String expected =   "Exam Scores:\n"        +
                            "\tExam 1 -> 100.0\n"   +
                            "\tExam 2 -> 95.0\n"    +
                            "\tExam 3 -> 123.0\n"   +
                            "\tExam 4 -> 96.0\n"    +
                            "\tExam 5 -> 100.0";

        // When
        student.addExamScore(100.0);
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0));
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n"        +
                        "\tExam 1 -> 150.0";

        // When
        student.setExamScore(1, 150.0);
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 125.0;

        // When
        Double actual = student.getStudentAverageExamScore();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        String expected =   "Student Name: Leon Hunter\n"   +
                            "> Average Score: 103.5\n"      +
                            "> Exam Scores:\n"                +
                            "\tExam 1 -> 100.0\n"           +
                            "\tExam 2 -> 95.0\n"            +
                            "\tExam 3 -> 123.0\n"           +
                            "\tExam 4 -> 96.0";

        // When
        String actual = student.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }



}