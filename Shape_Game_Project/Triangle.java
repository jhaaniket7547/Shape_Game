class Triangle{
	double a;
	double b;
	double c;
	Triangle(){
	}
	Triangle(double a, double b, double c){
		if(a+b>c && b+c>a && c+a>b){
			System.out.println("It is a Valid Triangle");
			this.a=a;
			this.b=b;
			this.c=c;
		}
		else
			System.out.println("It is NOT a Valid Triangle! Side is NOT Set!");
	}
	public void getArea(){
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is: "+area+" Sq. Unit");
	} 
	public void getPerimeter(){
		System.out.println("Perimeter of Triangle is: "+(a+b+c)+" Unit");
	}
}




