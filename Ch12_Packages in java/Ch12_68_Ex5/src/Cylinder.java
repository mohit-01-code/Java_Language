package com.shape;

public class Cylinder extends Sphere{
	public int height;
	public int c_radius;

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return this.height;
	}

	public void setC_radius(int radius){
		this.c_radius = radius;
	}

	public int getC_radius(){
		return this.c_radius;
	}

	public void display(){
		System.out.printf("\nThe Volume of Cyclinder having height %d and Radius %d is : %.2f\n", this.getHeight(), this.getC_radius(), (Math.PI * this.c_radius * this.c_radius * this.height));
		System.out.printf("The Surface area of cylinder having height %d and Radius %d is : %.2f\n", this.getHeight(), this.getC_radius(), (2 * Math.PI * this.c_radius * this.height));
		
		System.out.printf("\nThe volume of Sphere having radius %d is : %.2f\n", this.getS_radius(), ((4.0f/3) * Math.PI * this.s_radius * this.s_radius * this.s_radius));
		System.out.printf("The surface area of Sphere having radius %d is : %.2f\n", this.getS_radius(), (4 * Math.PI * this.s_radius * this.s_radius));

		System.out.printf("\nThe Area of circle having radius %d is : %.2f\n", this.getRadius(), (Math.PI * this.radius * this.radius));
		System.out.printf("The Circumference of circle having Radius %d is : %.2f\n", this.getRadius(), (2 * Math.PI * this.radius));
		
		System.out.println("\nThe Area of Rectangle having length "+this.getLength()+" and breadth "+this.getBreadth()+" is : "+(this.length * this.breadth));
		System.out.println("The Perimeter of Rectangle having length "+this.getLength()+" and breadth "+this.getBreadth()+" is : "+(2 * (this.length + this.breadth)));
			
		System.out.println("\nThe Area of Square having side "+this.getSide()+" is : "+(this.side * this.side));
		System.out.println("The Perimeter of Square having side "+this.getSide()+" is : "+(4 * (this.side)));	
	}

	public static void main(String[] args){
		Cylinder shp1 = new Cylinder();
		
		shp1.setRadius(6);

		
		shp1.setHeight(9);
		shp1.setC_radius(7);

		shp1.setLength(5);
		shp1.setBreadth(3);

		shp1.setS_radius(12);
		
		shp1.setSide(6);

		shp1.display();
	}	
}