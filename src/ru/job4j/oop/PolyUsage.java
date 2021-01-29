package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal pet = new Pet();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();
        Animal[] animals = new Animal[] {cow, goose, pet, dog, guineaPig};
        for (Animal a : animals) {
            a.sound();
        }
    }
}
