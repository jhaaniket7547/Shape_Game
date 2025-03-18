class Circle{
	double r;
	Circle(){
	}
	Circle(double r){
		this.r=r;
	}
	public void getArea(){
		System.out.println("Area of Circle is: "+Math.PI*r*r+" Sq. Unit");
	} 
	public void getPerimeter(){
		System.out.println("Perimeter of Circle is: "+2*Math.PI*r+" Unit");
	}
}




