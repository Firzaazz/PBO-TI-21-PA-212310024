
import java.util.*;
public class Latihan02 {
  static long faktorial(int n){
    long s =1;
    int i = 1;
    while(i <= n){
      s=s*i;
      i++;
    }
    return s;
  }
  public static void main(String[] args){
	  System.out.println("==============================================");
    int n, i, j;
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukkan nilai: ");
    System.out.println("==============================================");
    n = scan.nextInt();
    for (i=0; i<n+1; i++){
      for (j=0; j<n-i-1; j++){
        System.out.print(" ");
      }
      for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
  }  
}
