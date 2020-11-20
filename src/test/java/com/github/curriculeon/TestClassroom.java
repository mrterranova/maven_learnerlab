package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {
    @Test
    public void testHostLecutuer(){
        //given
        Classroom classroom = Classroom.INSTANCE;
//        Instructors instructors = Instructors.getInstance();
//        Students students = Students.getInstance();
        Teacher teacherAsTeacher = (Teacher) Instructors.getInstance().findById(3L);
        Map<Student, Double> preStudyMap = classroom.getStudyMap();
        Double numberOfHoursToTeach = 999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / Students.getInstance().count();

        //when
        classroom.hostLecture(teacherAsTeacher, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student: keySet){
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            Assert.assertEquals(expectedStudyTime,actualStudyTime);
        }

        //then


    }
}
