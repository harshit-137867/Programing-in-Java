// Base class (Grandparent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate derived class (Parent) inheriting from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Final derived class (Child) inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

// Main class to execute the code
class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Dog myDog = new Dog();

        // Accessing methods from all levels of inheritance
        myDog.eat();  // Inherited from Animal
        myDog.walk(); // Inherited from Mammal
        myDog.bark(); // Defined in Dog class
    }
}