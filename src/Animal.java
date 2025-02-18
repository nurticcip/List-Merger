import java.util.ArrayList;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal making sound");
    }

    public void eat(){
        System.out.println("Animal eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat2(Animal a){
        Cat c = new Cat("koshka", 1, true);
        a = c;
    }
}

class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal{
    private boolean hasFur;

    public Cat(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void makeSound(){
        System.out.println("Cries like a baby");
    }

    public void eat(){
        System.out.println("Cat is drinking milk");
    }


}

class AnimalKingdom{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Monkey", 3);
        Animal animal2 = new Dog("Rex", 1, "Chihuahua");
        Animal animal3 = new Cat("Murzik", 2, true);

        animal1.makeSound(); animal1.eat();
        animal2.makeSound(); animal2.eat();
        animal3.makeSound(); animal3.eat();

        animal1.eat2(animal2);

        System.out.println(animal2 instanceof Dog);

    }
}





