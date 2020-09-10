package com.example.mirea;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    ArrayList<Dog> dogs = new ArrayList<>();
    public void AddDogs(int a){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        for(int i = 0; i < a; i++){
            System.out.println("Enter name and age of the dog:");
            name = scanner.nextLine();
            age = scanner.nextInt();
            dogs.add(new Dog(name, age));
        }
    }
}
