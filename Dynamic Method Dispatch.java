// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
    
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    void eat() {
        System.out.println("Dog is eating bones");
    }
    
    // Dog-specific method
    void wagTail() {
        System.out.println("Dog is wagging tail");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
    
    @Override
    void eat() {
        System.out.println("Cat is eating fish");
    }
    
    // Cat-specific method
    void purr() {
        System.out.println("Cat is purring");
    }
}

// Derived class 3
class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("Quack! Quack!");
    }
    
    @Override
    void eat() {
        System.out.println("Duck is eating seeds");
    }
    
    // Duck-specific method
    void swim() {
        System.out.println("Duck is swimming");
    }
}

public class DynamicDispatchDemo {
    // Method that demonstrates dynamic dispatch
    public static void animalActions(Animal animal) {
        System.out.println("\nPerforming actions for: " + animal.getClass().getSimpleName());
        animal.makeSound();  // This call is dynamically dispatched
        animal.eat();        // This call is dynamically dispatched
    }
    
    public static void main(String[] args) {
        // Creating objects of different types
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();      // Upcasting
        Animal cat = new Cat();      // Upcasting
        Animal duck = new Duck();    // Upcasting
        
        // Demonstrating dynamic method dispatch
        System.out.println("=== Dynamic Method Dispatch Demo ===");
        animalActions(genericAnimal);
        animalActions(dog);
        animalActions(cat);
        animalActions(duck);
        
        // Demonstrating limitations of dynamic dispatch
        System.out.println("\n=== Dynamic Dispatch Limitations ===");
        
        // These won't work without casting because Animal reference doesn't know about these methods
        // dog.wagTail();  // Compilation error
        // cat.purr();     // Compilation error
        // duck.swim();    // Compilation error
        
        // To call specific methods, we need to cast back to specific type
        System.out.println("\nUsing explicit casting to call specific methods:");
        ((Dog)dog).wagTail();
        ((Cat)cat).purr();
        ((Duck)duck).swim();
        
        // Demonstrating runtime type checking
        System.out.println("\n=== Runtime Type Checking ===");
        Animal[] animals = {dog, cat, duck};
        
        for(Animal a : animals) {
            if(a instanceof Dog) {
                ((Dog)a).wagTail();
            } else if(a instanceof Cat) {
                ((Cat)a).purr();
            } else if(a instanceof Duck) {
                ((Duck)a).swim();
            }
        }
    }
}
