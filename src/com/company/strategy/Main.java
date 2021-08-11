package com.company.strategy;


public class Main {
    public static void main(String[] args) {
        Dog[] array = new Dog[]{new Dog(3), new Dog(1), new Dog(2)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(array, new DogSoundComparator());
        for (Dog dog : array) {
            System.out.print(dog + " ");
        }
    }
}
