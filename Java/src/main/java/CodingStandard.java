
public class CodingStandard {
	
	 public int add(int a, int b) {
	        return a + b;
	    }
	  
	 public int subtract(int a, int b) {
	        return a - b;
	    }

	
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		 int sum = calculator.add(5, 3); // 5 + 3 = 8
	        System.out.println("Sum: " + sum);
	        int difference = calculator.subtract(5, 3); // 5 - 3 = 2
	        System.out.println("Difference: " + difference);

	
	

	}
	

}
