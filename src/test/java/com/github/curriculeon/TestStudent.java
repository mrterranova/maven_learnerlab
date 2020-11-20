package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testInheritance() {
        Student student = new Student(3L, null);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(3L, null);
        Double numberOfHours = 10.0;
        Double beforeTime = student.getTotalStudyTime();
        Double totalTime = beforeTime + numberOfHours;

        student.learn(numberOfHours);

        Assert.assertEquals(totalTime, student.getTotalStudyTime());
    }
}
