//Calculating Area & Perimeter.

import java.util.Scanner;
class Shape {
    protected float radius, side;
}

class Circle extends Shape {
    void getdata() {
        System.out.print("Enter radius of circle: ");
        radius = Shapetest.sc.nextFloat();
        CalcArea();
        CalcPeri();
    }
    void CalcArea() {
        float Area = 22 * radius * radius / 7;
        System.out.println("Area of Circle: " + Area);
        
    }
    void CalcPeri() {
        float Perimeter = 2 * 22 * radius / 7;
        System.out.println("Perimeter of Circle: " + Perimeter);
    }
}

class Square extends Shape {
    void getdata() {
        System.out.print("Enter side of sqaure: ");
        side = Shapetest.sc.nextFloat();
        CalcArea();
        CalcPeri();
    }
    void CalcArea() {
        float Area = side * side;
        System.out.println("Area of Square: " + Area);
        
    }
    void CalcPeri() {
        float Perimeter = side * 4;
        System.out.println("Perimeter of Square: " + Perimeter);
    }
}

class Shapetest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.getdata();
        System.out.println();
        Square sq = new Square();
        sq.getdata();
    }
}