package com.github.curriculeon;

import com.github.curriculeon.Learner;
import com.github.curriculeon.Teacher;

public enum Educator implements Teacher {

    Teacher1(1L, "Teacher1"),
    Teacher2(2L, "Teacher2");

    public final Instructor instructor;

    public double getTimeWorked() {
        return timeWorked;
    }

    public double timeWorked;

    public Instructor getInstructor() {
        return instructor;
    }

    Educator(Long id, String name){
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        timeWorked+= numberOfHours;
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked+= numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
}
