
import java.util.Scanner;
public class Latihan01 {
			
			public static void main(String[] args) {
				double celcius, fahrenheit, reamur, kelvin;
				
				Scanner input = new Scanner(System.in);
				System.out.print("Masukkan suhu Celcious yang akan dihitung: " );
				celcius = input.nextInt(); //suhu celcius
				reamur = celcius*4/5; //suhu reamur
				fahrenheit = (celcius*9/5) + 32; //suhu fahrenheit
				kelvin = celcius + 273.15; //suhu kelvin
				
				System.out.println("Suhu celcius: " + celcius);
				System.out.println("Suhu reamur: " + reamur);
				System.out.println("Suhu fahrenheit: " + fahrenheit);
				System.out.println("Suhu kelvin: " + kelvin);
				
			
				
				
				
			}	
	}


