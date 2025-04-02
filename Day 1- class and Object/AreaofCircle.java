class AreaofCircle{
    int radius;
    public AreaofCircle(int radius){
        this.radius=radius;
    }
    public double caluclateArea(double radius){
        return 3.14*radius*radius;
    }
    public double caluclateCircumference(double radius){
        return Math.round(Math.PI*2*radius*10.0)/10.0;
    }
    public void displayDetails(){
        System.out.println("The radius is "+radius);
        System.out.println("The area of the circle is "+caluclateArea(radius));
        System.out.println("The circumference of the circle is "+caluclateCircumference(radius));
    }
    public static void main(String[] args) {
        AreaofCircle area=new AreaofCircle(5);
        area.displayDetails();
    }
}
