
public class Latihan03 {
	public static void main(String[] args) {
		//segitiga kerucut
		  System.out.println("==========================================================");
		  double phi, luas, r,s, t, volsegi, voltabung, jari, Tinggi;
		  phi = 3.14;
		  r = 50;
		  s = 20;
		  t = 35;
		  luas = (phi * (r * r)) + (phi * r * s);
		  volsegi = 0.33 * phi * (r * r) * t;
		  System.out.println("sebuah Persegi dengan jari jari 		: 50 " );
		  System.out.println("                      tinggi    		: 35 " );
		  System.out.println("                      garis pelukis          	: 35 " );
		  System.out.println("Luas segitiga kerucut = " + luas);
		  System.out.println("Volume segitiga kerucut = " + volsegi);
		  
		  System.out.println("==========================================================");
		  
		  
		  //tabung
		  jari = 15;
		  Tinggi = 20;
		  voltabung = phi * (jari * jari) * Tinggi;
		  System.out.println("sebuah tabung dengan jari jari : 15 " );
		  System.out.println("                     tinggi    : 20 " );
		  System.out.println("maka volume tabung = " + voltabung);
	}
}
