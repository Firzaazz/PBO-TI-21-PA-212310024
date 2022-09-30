import java.util.Scanner;

public class Latihan02 {

	public static void main(String[] args) {
		int npm,i;
	    boolean angka_prima = true;
	    
		
		Scanner input = new Scanner(System.in);
		
	     
	    System.out.print("Input NPM anda : ");
	    npm = input.nextInt();
	    input.close();
	     
	 
	    if (npm == 0 || npm == 1) {
	      angka_prima = false;
	    }
	    else {
	      for (i = 2; i <= npm / 2; i++) {
	        if (npm % i == 0) {
	          angka_prima = false;
	          break;
	        }
	      }
	    } 
	     
	    if (angka_prima)
	      System.out.println( npm + "  bilangan prima");
	    else
	      System.out.println( npm + " Bukan bilangan prima ");
	  }
	

	}


