//Class Area

import java.util.Scanner;
class Area_of_figures {
	protected float area;
	protected float perimeter;

	void Area (float area) {
		System.out.println("Area of figure: " + area);
	}
	void Perimeter (float perimeter) {
		System.out.println("Perimeter of figure: " + perimeter);
	}
}

class square extends Area_of_figures {
	private float side;
	
	void input() {
		System.out.print("Enter side of square: ");
		side = Area.sc.nextFloat();
		area = side * side;
		perimeter = 4 * side;
	
		Area(area);
		Perimeter(perimeter);
	}
}

class circle extends Area_of_figures {
	private float radius;

	void input() {
		System.out.print("Enter radius of circle: ");
		radius = Area.sc.nextFloat();
		area = 22 * radius * radius / 7;
		perimeter = 2 * 22 * radius / 7;
	
		Area(area);
		Perimeter(perimeter);
	}
}

class rectangle extends Area_of_figures {
	private float length, breadth;
	
	void input() {
		System.out.print("Enter length & breadth of rectangle: ");
		length = Area.sc.nextFloat();
		breadth = Area.sc.nextFloat();
		area = length * breadth;
		perimeter = 2 * (length + breadth); 
		
		Area(area);
		Perimeter(perimeter);
	}
}

public class Area {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n----AREA & PERIMETER----");
			System.out.println("1.Square");
			System.out.println("2.Circle");		
			System.out.println("3.Rectangle");
			System.out.println("4.Exit");
			System.out.println("Enter choice (1-3): ");
			choice = sc.nextInt();

			switch (choice) {
				case 1: square sq = new square();
						sq.input();
						break;

				case 2: circle cir = new circle();
						cir.input();
						break;

				case 3: rectangle rect = new rectangle();
						rect.input();
						break;

				case 4: System.out.println("Exiting!");
						break;

				default: System.out.println("Wrong choice entered! Try again.");
			}
		} while (choice != 4);
	
	}
}