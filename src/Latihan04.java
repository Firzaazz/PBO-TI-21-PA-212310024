import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan04 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		 LocalDateTime waktuSekarang = LocalDateTime.now();
	        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
	        String waktu = waktuSekarang.format(formatWaktu);
		
		double Hargabarang = 6000;
		double jumlahbarang,totalharga,diskon;
		double bdisko;
		
		System.out.println("===================================");
        System.out.println("\tTOKO SERBAGUNA IBIK");
        System.out.print("===================================\n");
        System.out.print("Masukkan jumlah produk yang dibeli = ");
        
        jumlahbarang = input.nextInt();
        totalharga = Hargabarang * jumlahbarang;
        
        System.out.println(waktu);
        System.out.println("ITEM \t\tQTY \t\tHARGA \t\tTOTAL");
        System.out.println("===========================================================");

        System.out.println("ROTI ENAK. \t" + jumlahbarang + "\t\tRp " + Hargabarang + "\tRp " + totalharga);
        System.out.println("------------------------------------------------------------");
        
        if(jumlahbarang % 3 == 0) {
            diskon = 0.05 * totalharga;
            bdisko = totalharga - diskon;
            System.out.println("Diskon: 5%");
        } else {
            diskon = 0.1 * totalharga;
            bdisko = totalharga - diskon;
            System.out.println("Diskon: 10%");
        }

        System.out.println("Sub Total = Rp " + bdisko);

        input.close();
    }


}

	

