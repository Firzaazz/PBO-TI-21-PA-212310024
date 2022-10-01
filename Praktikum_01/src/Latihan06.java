import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Latihan06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namadep,namabel;
        int NPM,usia;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Nama depan: ");
        namadep = keyboard.nextLine();
 
        System.out.print("Nama belakang: ");
        namabel= keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("NPM: ");
        NPM = keyboard.nextInt();

        String biodata=namadep+namabel+usia+NPM;
        System.out.print(biodata);


      	
	}

}
