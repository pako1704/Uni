
public class Arrays {
	public static void main(String[] args){
		
		if(args.length != 1){
			System.out.println("Error, invalid number arguments!");
			return;
		}
		double radius = Double.parseDouble(args[0]);		
		System.out.println(Arrays.calculateCircumference(199));
		
	}
	public static double calculateCircumference(double radius){
		return 2 * Math.PI * radius;
	}
}
