import java.util.Scanner;

public class Latihan04 {

	public static void main(String[] args) {
			int bil,i,faktorial,n,h;
			int x =1;
		    
		    
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("=======================================");
		    System.out.print("masukan bilangan : ");
		    bil = input.nextInt();
		    input.close();
		    System.out.println("=======================================");
		     
		 
		    if (bil <=20 ) {
		     System.out.println("bilangan anda terlalu kecil");
		    }
		    else {
		    	for(i=1 ;i<bil;i++) {
		    	x=x*i;
		    	 if (i<bil) {
		    		 System.out.print(i + "x");
		    	 }else 
		    		System.out.print(bil );
		    	}
		    	System.out.println("=" + x);
		    
		    	}
		        }
		    }

	