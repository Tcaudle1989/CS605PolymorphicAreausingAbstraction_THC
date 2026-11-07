
public class Square extends Shape {
	
	private double side;
	
	public Square() {
		side = 0.0;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getInteriorArea() {
		return side * side;
	}
}
