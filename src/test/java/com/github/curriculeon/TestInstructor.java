package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Assert.assertTrue(new Instructor(3L, null) instanceof Teacher);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(3L,null);
        Learner student = new Student(1l, null);
        double numberOfHoursToTeach = 6;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;

        instructor.teach(student, numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(3L, null);
        Learner student1 = new Student(1l, null);
        Learner student2 = new Student(2l, null);
        Learner[] students = {student1, student2};

        double numberOfHoursToTeach = 2;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double expected1 = preStudyTime1 + numberOfHoursToTeach/2;
        double expected2 = preStudyTime2 + numberOfHoursToTeach/2;

        instructor.lecture(students, numberOfHoursToTeach);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected1, actual1, 0);
        Assert.assertEquals(expected2, actual2, 0);
    }
}
