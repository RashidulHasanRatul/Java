package OOP_JAVA.Polymorphism;

public class Mainclass {
    //It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
