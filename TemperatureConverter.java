public class TemperatureConverter {
	double celsius;
	void convert() {
		double farenheit= (celsius*(9/5))+32;
		System.out.println("The temperature for "+celsius+" C in farenheit is: "+farenheit);
	}
	
	public static void main(String[] args) {
		TemperatureConverter obj = new TemperatureConverter();
		obj.celsius=36.5;
		obj.convert();
		
	}

}
