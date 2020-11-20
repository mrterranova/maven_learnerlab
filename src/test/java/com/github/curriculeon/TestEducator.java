package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        //given
        Educator educator = Educator.Teacher1;
        //when
        boolean outcome = educator instanceof Teacher;
        //then
        Assert.assertTrue(outcome);
    }

    ///////// DOESNT INHERIT

    @Test
    public void testTeach(){
        //Given
        Educator educator = Educator.Teacher1;
        Student student = new Student(1l, null);
        double expected = 2.0;
        //When
        educator.teach(student, expected);
        //Then
        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void testLecture(){
        //Given
        Educator educator = Educator.Teacher2;
        Students students = Students.getInstance();
        Learner[] learners = students.toArray();
        double expected = 600.0;
        //When
        educator.lecture(learners, expected);
        //Then
        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.01);

    }
}
