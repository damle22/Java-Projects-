package mix_sorting;

import java.util.Arrays;


public class driver {

	public static void main(String[] args) {
		

		Car c1 = new Car("BMW M3 Sedan", 2016, 50000.0);
		Car c2 = new Car("Toyota Lexus", 2017, 25000.0);
		Car c3 = new Car("Lincoln", 2014, 39000.0);
		Car c4 = new Car("Mazda", 2015, 25000.0);
		Car c5 = new Car("Ford", 2019, 32000.0);
		Car c6 = new Car("Honda", 2017, 25000.0);
		
		
		Car[] carArray = {c1,c2,c3,c4,c5,c6};
		
		System.out.println("Car list sorted  by year\n" +
		                   "=========================");
		
		Arrays.sort(carArray);
		
		for(Car c: carArray)
			System.out.println(c);
	}

}
