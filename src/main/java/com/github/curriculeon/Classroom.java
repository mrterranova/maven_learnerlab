package com.github.curriculeon;

import com.github.curriculeon.Learner;
import com.github.curriculeon.Teacher;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    INSTANCE;
    private Students students;
    private Instructors instructors;

    Classroom() {
        this(Students.getInstance(), Instructors.getInstance());
    }

    Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Person[] personArray = (Person[]) students.toArray();
        Learner[] learnerArray = new Learner[personArray.length];
        for (int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            Learner personAsLearner = (Learner) currentPerson;
            learnerArray[i] = personAsLearner;
        }
        teacher.lecture(learnerArray, numberOfHours);
    }

    //overloading previous method
    public void hostLecture(Long idOfInstructor, double numberOfHours) {
        Instructors instructorsSingleton = Instructors.getInstance();
        Person instructorAsPerson = instructorsSingleton.findById(idOfInstructor);
        Teacher instructorAsTeacher = (Teacher) instructorAsPerson;
        hostLecture(instructorAsTeacher,numberOfHours);
    }

//    public Map<Student, Double> getStudyMap() {
//        Map<Student, Double> map = new HashMap<>();
//        for (Student student : Students.getInstance()) {
//            Double totalStudyTime = student.getTotalStudyTime();
//            map.put(student, totalStudyTime);
//        }
//        return map;
//    }
//}
}
