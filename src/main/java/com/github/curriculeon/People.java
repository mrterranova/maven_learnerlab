package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<Type extends Person> implements Iterable<Person> {
   protected List<Person> personList = new ArrayList<>();

   public void add(Person person) {
       personList.add(person);
   }

   public Person findById(Long id){
       return personList
               .stream()
               .filter(person -> person.getId() == id)
               .findFirst()
               .get();
   }

   public Boolean contains(Person person) {
       return personList.contains(person);
   }

   public void remove( Person person){
       personList.remove(person);
   }

   public void remove(Long id) {
       List<Person> temp = new ArrayList<>();
       personList
               .stream()
               .map( person -> {
                   if (person.getId() == id) temp.add(person);
                   return temp;
               });
       personList.remove(temp);
   }

   public void removeAll() {
       personList.clear();
   }

   public Integer count(){
       return personList.size();
   }

   @Override
    public Iterator<Person> iterator(){
       return personList.iterator();
   }

   abstract public Learner[] toArray();

}
