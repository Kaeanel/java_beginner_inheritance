public class Main {

    public static void main(String[] args) {
        Object[] list = {new Dog(), new DogFood()};
        dog.makeSound();

    }
}

class Animal {
    String sound = "";

    void makeSound(){
        System.out.println(sound);
    }
}

class Dog extends Animal{
    Dog() {
        sound = "bark";
    }
}

class DogFood {

}