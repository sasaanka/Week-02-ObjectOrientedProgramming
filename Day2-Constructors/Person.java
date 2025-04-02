class Person{
    String name;
    int age;
    String address;
    Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    Person(Person other){
        this.name=other.name;
        this.address=other.address;
        this.age=other.age;
    }
    void DisplayDetails(){
        System.out.println("Name is "+name +" and location is "+address+" age is "+age);
    }
    public static void main(String[] args) {
        Person p1=new Person("Sasanka","Guntur",20);
        Person p2=new Person(p1);
        p1.DisplayDetails();
        p2.DisplayDetails();
    }
}