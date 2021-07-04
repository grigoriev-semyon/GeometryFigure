package com.company;

public class Person {
    int age;
    String name;
}
class Employee extends Person{
    public String company;
    public Employee(){
        super();
        company = "";
    }
    public void work(){};
    public void relax(){};
}
