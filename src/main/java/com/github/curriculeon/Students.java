package com.github.curriculeon;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1l, "student1"));
        add(new Student(2l, "student2"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Learner[] toArray() {
        Student[] createArray = new Student[0];
        Student[] filledArray = personList.toArray(createArray);
        return filledArray;
    }
}
