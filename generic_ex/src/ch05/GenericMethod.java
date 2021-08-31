package ch05;

public class GenericMethod {

	public static <X , Y> double makeRectangle(Point<X, Y> p1, Point<X, Y> p2) {
		
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getX()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left; 
		double height = bottom - top; 
		
		return width * height; 
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double size = makeRectangle(p1, p2);
		System.out.println(size);
		
	}
}
