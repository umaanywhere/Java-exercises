class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
    public void walk()
    {
        System.out.println("Animal walk");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }

    public void scratch() {
        System.out.println("The cat scratches");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void wagTail() {
        System.out.println("The dog wags its tail");
    }
}

 class DownCasting {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        animal1.makeSound(); //  The cat meows

        // Downcasting animal1 to a Cat object
        Cat cat1 = (Cat) animal1;
        cat1.walk();
        cat1.makeSound(); //  The cat meows
        cat1.scratch(); //  The cat scratches

        Animal animal2 = new Dog();
        animal2.makeSound(); //  The dog barks

        // Downcasting animal2 to a Dog object
        Dog dog1 = (Dog) animal2;
        dog1.makeSound(); // The dog barks
        dog1.wagTail(); // The dog wags its tail
    }
}