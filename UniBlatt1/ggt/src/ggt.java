
public class ggt {
	public static void main(String[] args) {
		float[] numbers = convertToFloatArray(args);
		if(numbers == null || numbers.length == 0 || numbers.length == 1){
			System.out.println("invalid");
		}else{
			System.out.println(ggtMain(numbers));
		}
	}

	private static float ggtMain(float[] numbers) {
		float ggt = ggt(numbers[0], numbers[1]);
		for(int i = 2; i < numbers.length; i++){
			ggt = ggt(ggt, numbers[i]);
		}
		return ggt;
	}

	private static float[] convertToFloatArray(String[] args) {
		float[] returnArray = new float[args.length];
		for(int i = 0; i < args.length; i++){
			try {
				returnArray[i] = Float.parseFloat(args[i]);
			} catch (Exception e) {
				return null;
			}
		}
		return returnArray;
	}
	private static float ggt(float number1, float number2){
		float[] calc = new float[2];
		float rest = 0;
		if(number1 > number2){
			calc[0] = number1;
			calc[1] = number2;
		}else{
			calc[0] = number2;
			calc[1] = number1;
		}
		do{
			rest = calc[0] % calc[1];
			calc[0] = calc[1];
			calc[1] = rest;
		}while(rest != 0);
		return calc[0];
	}
}
