class Animal{
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String makesound(){
        return "Generic sound";
    }
    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ", Age: " + age + ") says: " + makesound();
    }
}
class Dog extends Animal{
    public Dog(String name,int age){
        super(name, age);
    }
    @Override
    public String makesound(){
        return "Bow bow";
    }
}
class Cat extends Animal{
    public Cat(String name,int age){
        super(name, age);
    }
    @Override
    public String makesound(){
        return "meow meowww";
    }
}
class Bird extends Animal{
    public Bird(String name,int age){
        super(name, age);
    }
    @Override
    public String makesound(){
        return "Chirp";
    }
}
public class AnimalTest{
    public static void main(String[] args) {
        Animal a1=new Dog("Buddy",3);
        Animal a2=new Cat("Chikku",3);
        Animal a3=new Bird("PAkshi",1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
