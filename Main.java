
public class Main {

	public static void main(String[] args) {
		Shape square = new Square(2.0);
		Shape circle = new Circle(2.0);
		
		System.out.println(square.getInteriorArea());
		System.out.printf("%.2f", circle.getInteriorArea());

	}

}
