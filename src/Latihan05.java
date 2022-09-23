import java.util.Scanner;

public class Latihan05 {

	  public static void main(String args[])
	   {
	      System.out.println("Masukkan kalimat yang ingin diubah : ");
	      Scanner input = new Scanner(System.in);
	      String kalimat = input.nextLine();
	      
	      System.out.println(" kapital dari kalimat tersebut : ");
	      String kapital = kalimat.toUpperCase();
	      
	      System.out.println(kapital);
	      
	}
}