package com.tns.ifet.day6;

public class Square extends Shape {
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}

}
