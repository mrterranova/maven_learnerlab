package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void testConstructor(){
        // : Given
        long expectedId = Long.MAX_VALUE;
        String expectedName = "Michal";
        // : When
        Person person = new Person(expectedId, expectedName);

        //
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName(){
        // : Given
        long expectedId = Long.MAX_VALUE;
        String expectedName = "Michal";
        // : When
        Person person = new Person(expectedId, expectedName);

        //
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }
}

