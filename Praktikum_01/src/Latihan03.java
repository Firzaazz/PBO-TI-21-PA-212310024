
public class Latihan03 {
	public static void main(String[] args) {
		
		  System.out.println("==========================================================");
		  double phi, luas, a,tp, t, volkeru, Luaslay, D1, D2,k;
		  phi = 3.14;
		  a = 50;
		  t = 20;
		  tp = 35;
		  k=(2*a)+(t*3);
		  luas = (2*a)+(k*t);
		  volkeru = (0.5 *a*t);
		  System.out.println("sebuah Persegi dengan alas 		: 50 " );
		  System.out.println("                      tinggi    		: 35 " );
		  System.out.println("Luas Prisma segitiga= " + luas);
		  System.out.println("Volume sPrisma segitiga = " + volkeru);
		  
		  System.out.println("==========================================================");
		  
		  
		
		  D1 = 15;
		  D2 = 20;
		  Luaslay = 0.5 * D1*D2;
		  System.out.println("sebuah layang layang			D1 : 15 " );
		  System.out.println("                     tinggi   D2: 20 " );
		  System.out.println("maka volume tabung = " + Luaslay);
	}
}
