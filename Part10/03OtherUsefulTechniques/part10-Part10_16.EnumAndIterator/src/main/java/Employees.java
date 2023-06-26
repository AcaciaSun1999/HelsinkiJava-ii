/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person>list;
    
    public Employees(){
        this.list = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.list.addAll(peopleToAdd);
    }
    
    public void print(){
        this.list.stream()
                .forEach(person -> System.out.println(person));
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
