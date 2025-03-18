import java.util.Scanner;
class Driver{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1===>For Circle");
		System.out.println("Press 2===>For Rectangle");
		System.out.println("Press 3===>For Square");
		System.out.println("Press 4===>For Triangle");
		int choice=sc.nextInt();
		if(choice==1){
			System.out.println("You have Selected Circle");
			System.out.println("ENter the Radius: ");
			double radius=sc.nextDouble();
			Circle c1=new Circle(radius);
			c1.getArea();
			c1.getPerimeter();
		}
		else if(choice==2){
			System.out.println("You have Selected Rectangle");
			System.out.println("ENter the Length: ");
			double l=sc.nextDouble();
			System.out.println("ENter the width: ");
			double w=sc.nextDouble();
			Rectangle r1=new Rectangle(l,w);
			r1.getArea();
			r1.getPerimeter();
		}
		else if(choice==3){
			System.out.println("You have Selected Square");
			System.out.println("ENter the Side: ");
			double s=sc.nextDouble();
			Square s1=new Square(s);
			s1.getArea();
			s1.getPerimeter();
		}
		else if(choice==4){
			System.out.println("You have Selected Triangle");
			System.out.println("ENter the Side1: ");
			double a=sc.nextDouble();
			System.out.println("ENter the Side2: ");
			double b=sc.nextDouble();
			System.out.println("ENter the Side3: ");
			double c=sc.nextDouble();
			Triangle t1=new Triangle(a,b,c);
			t1.getArea();
			t1.getPerimeter();
		}
		else{
			System.out.println("This is NOT the Valid Choice");
			System.out.println("Please Select from the Valid Choice!!");
			String[] p={};
			main(p);
		}
		System.out.println("======Program Ends======");
	}
}




