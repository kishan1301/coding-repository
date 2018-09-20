package com.nucleus.mains;

import com.nucleus.POJO.AreaRectangle;
import com.nucleus.POJO.PerimeterRectangle;
import com.nucleus.POJO.Rectangle;

public class DriverRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle perimeter = new PerimeterRectangle();
		System.out.println("Perimeter of the rectangle is " + perimeter.compute(12, 25));
		Rectangle area = new AreaRectangle();
		System.out.println("Area of the rectangle is " + area.compute(12, 25));
		
		
	}

}
