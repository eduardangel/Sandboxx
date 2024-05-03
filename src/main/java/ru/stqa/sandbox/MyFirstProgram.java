package ru.stqa.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Eduard");

    double len = 5.0;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

    Square s = new Square(6);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    double x = 4;
    double y = 6;
    System.out.println("Площадь квадрата со сторонами " + x + " и " + y + " = " + area(x,y));

    Rectangle rectangle = new Rectangle(2,5);
    System.out.println("Площадь квадрата со сторонами " + rectangle.x + " и " + rectangle.y + " = " + rectangle.area());
  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
  public static double area (double l){
    return l * l;
  }
  public static double area (double width, double height){
    return width * height;
  }
}