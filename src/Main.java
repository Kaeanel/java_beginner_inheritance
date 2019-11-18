public class Main {

    public static void main(String[] args) {
        Object[] list = {new Dog(), new DogFood()};
        Dog dog = (Dog) list[0];  // (Dog) means I'm using a cast
        for (Object object : list) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound(); // correcto, usando el parénteis ((Animal) object) hacemos que se haga el cast en primer lugar
            }
        }
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