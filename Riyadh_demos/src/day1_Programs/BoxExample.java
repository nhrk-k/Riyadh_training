package day1_Programs;

class Box {
	double height, width;
	Box(double h, double w){					// constructor
		height = h;
		width = w;
	}
}

public class BoxExample {
	public static void main(String args [])
	{
		Box b = new Box(3.0, 5.0);
		System.out.println(b.height);
		System.out.println(b.width);
	}
}
