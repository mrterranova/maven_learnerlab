package com.github.curriculeon;

import com.github.curriculeon.*;

import java.util.HashMap;
import java.util.Map;

public enum  Classroom {
    INSTANCE;
    private Students students;
    private Instructors instructors;

    //THIS IS WHERE I HAVE QUESTIONS 12- 19
    Classroom() {
        this(Students.getInstance(), Instructors.getInstance());
    }

    Classroom(Students students, Instructors instructors){
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture (Teacher teacher, double numberOfHours) {
        Student[] personsArray = (Student[]) students.toArray();
        Learner[] learnersArray = new Learner[personsArray.length];
        for (int i = 0; i < learnersArray.length; i++) {
            Person currentPerson = personsArray[i];
            Learner personAsLearner = (Learner)currentPerson;
            learnersArray[i] = personAsLearner;
        }
        teacher.lecture(learnersArray, numberOfHours);
    }

    public void hostLecture (Long idOfInstructor, double numberOfHours) {
        Person instructorAsPerson = Instructors.getInstance().findById(idOfInstructor);
        Teacher instructorAsTeacher = (Teacher) instructorAsPerson;
    }

    public Map<Student,  Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for (Person person: Students.getInstance()) {
            Student student = (Student) person;
            Double totalStudyTime = student.getTotalStudyTime();
            map.put(student, totalStudyTime);
        }
        return map;

    }
}

