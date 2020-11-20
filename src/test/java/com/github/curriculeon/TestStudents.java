package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void test() {
        List<String> newList = new ArrayList<>();
        newList.add("student1");
        newList.add("student2");

        for (Person person: Students.getInstance()) {
            String personName = person.getName();

            Assert.assertTrue(newList.contains(personName));
        }
    }
}
