package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void test() {
        List<String> newList = new ArrayList<>();
        newList.add("Teacher1");
        newList.add("Teacher2");

        for (Person person: Instructors.getInstance()) {
            String personName = person.getName();

            Assert.assertTrue(newList.contains(personName));
        }
    }
}
