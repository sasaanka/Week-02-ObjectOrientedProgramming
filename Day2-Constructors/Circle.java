class Circle{
    double radius;
    Circle(){
        this(1.0);
    }
    Circle (double radius){
        this.radius=radius;
    }
     double Calarea(double radius){
        return Math.round(Math.PI*radius*radius*10.0)/10.0;
    }double calCircumference(double radius){
        return Math.round(Math.PI*2*radius*10.0)/10.0;
    }
    void displayresults(){
        System.out.println("Radius of the circle is "+radius+" whose area is "+Calarea(radius)+" and circumference is "+calCircumference(radius));
    }
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(6);
        circle1.displayresults();
        circle2.displayresults();
    }
}