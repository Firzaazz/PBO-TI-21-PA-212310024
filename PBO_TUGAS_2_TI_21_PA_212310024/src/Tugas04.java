
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tugas04 {

	static JOptionPane jop = new JOptionPane();
	
	public static void main(String[] args) {
		createNoRegis();
	}

	static void createNoRegis() {
		System.out.print("Masukkan Nomor: ");
		Scanner input = new Scanner(System.in);
		Integer a = input.nextInt();
		
		if(a.equals(0) || a.equals("")) {
			System.out.println("Masukan angka minimal 1 digit");
		}
		else {
			String noregis = String.format("%05d", a);
			System.out.println("No register:" + "IBIK" + noregis);	
		}
	}
}