public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.findFood();
    }
}

abstract class Animal {
    String sound = "";

    Animal(String sound) {
        this.sound = sound;
    }

    abstract void findFood();

    void makeSound(){
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Dog extends Animal{
    Dog() {
        super("bark");
    }

    @Override
    void findFood() {
        System.out.println("*looks at human*");
        makeSound();
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tail*");
    }
}

class DogFood {

}