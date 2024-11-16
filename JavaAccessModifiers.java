// File: Animal.java
package animals;

public class Animal {
    public String name;           // Accessible from anywhere
    private int age;             // Only accessible within this class
    protected String species;     // Accessible within same package and subclasses
    String color;                // Package-private: accessible only within same package

    // Public constructor
    public Animal(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    // Public method - accessible from anywhere
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
    }

    // Private method - only accessible within this class
    private void updateAge() {
        this.age++;
    }

    // Protected method - accessible within same package and subclasses
    protected void changeSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    // Package-private method - accessible only within same package
    void setColor(String newColor) {
        this.color = newColor;
    }
}

// File: Dog.java
package animals;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, "Dog", color);
    }

    public void demonstrateAccessModifiers() {
        // Accessible (public)
        System.out.println(name);
        
        // Not accessible (private)
        // System.out.println(age); // This would cause a compilation error
        
        // Accessible (protected, because Dog is a subclass of Animal)
        System.out.println(species);
        
        // Accessible (package-private, because Dog is in the same package)
        System.out.println(color);
        
        // Can call protected method (inherited)
        changeSpecies("Canine");
        
        // Can call package-private method (same package)
        setColor("Brown");
        
        // Cannot call private method
        // updateAge(); // This would cause a compilation error
    }
}

// File: Main.java
package test;

import animals.Animal;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Leo", 5, "Lion", "Golden");
        Dog dog = new Dog("Max", 3, "Brown");

        // Public members are accessible
        System.out.println(animal.name);
        animal.displayInfo();

        // These would cause compilation errors:
        // System.out.println(animal.age);     // Private - not accessible
        // System.out.println(animal.species);  // Protected - different package
        // System.out.println(animal.color);    // Package-private - different package
        
        dog.demonstrateAccessModifiers();
    }
}
