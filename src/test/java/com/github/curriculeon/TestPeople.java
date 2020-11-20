package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    People<Person> people = new People<Person>() {
        @Override
        public Learner[] toArray() {
            return (Learner[]) this.personList.stream().toArray(Person[]::new);
        }
    };

    @Test
    public void testAdd() {
        Person personAdded = new Person(3L,null);
        Assert.assertFalse(people.contains(personAdded));

        people.add(personAdded);

        Assert.assertTrue(people.contains(personAdded));
    }


    @Test
    public void testRemove(){
        Person personRemoved = new Person(3L, null);
        people.add(personRemoved);
        Assert.assertTrue(people.contains(personRemoved));

        people.remove(personRemoved);

        Assert.assertFalse(people.contains(personRemoved));
    }
}
