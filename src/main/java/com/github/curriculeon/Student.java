package com.github.curriculeon;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }


    public void learn(double numberOfHours){
         this.totalStudyTime += numberOfHours;
    }

    public void setTotalStudyTime(double totalStudyTime){
        this.totalStudyTime = totalStudyTime;
    }



    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
