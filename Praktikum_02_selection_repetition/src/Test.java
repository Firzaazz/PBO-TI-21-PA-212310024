import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 int i, j , k, l, N;
	        System.out.println("Masukan nilai N : ");
	        Scanner inputan = new Scanner(System.in);
	        N = inputan.nextInt();
	     
	        System.out.println("------bentuk pertama----------------------");
	        for (i=N; i>0; i--) {
	            for (j=0; j<i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	     
	        for (i=0; i<=N; i++) {
	            for (j=0; j<i; j++){
	                  System.out.print("*");
	            }
	            System.out.println();
	        }
	     
	        System.out.println("------bentuk kedua----------------------");
	        for (i=N; i>=1; i--) {
	            for (j=1; j<=N-i; j++){
	                System.out.print(" ");
	            }
	            for (k=1; k<=i; k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (i=0; i<=N; i++){
	             for (j=1; j<=N-i; j++){
	                 System.out.print(" ");
	             }
	             for (k=1; k<=i; k++){
	                 System.out.print("*");
	             }
	             System.out.println();
	         }
	}
}

		    
		