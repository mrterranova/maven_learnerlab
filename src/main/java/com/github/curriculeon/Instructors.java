package com.github.curriculeon;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(3L, "teacher1"));
        add(new Instructor(4L, "teacher2"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


    @Override
    public Learner[] toArray() {
        Person[] newPerson = new Person[0];
        Person[] filledPeople = personList.toArray(newPerson);

        return filledPeople;
    }
}
