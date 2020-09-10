package com.example.mirea;

public class Dog {
    private String Name;
    private int Age;
    Dog(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public int AgeInHumanAge(){
        return Age * 7;
    }
    public String ToString(){
        return "Name: " + Name + ", Age: " + Age;
    }
}
