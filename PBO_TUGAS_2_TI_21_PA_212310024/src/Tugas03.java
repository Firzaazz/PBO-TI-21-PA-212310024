

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tugas03 {

	static JOptionPane jop = new JOptionPane();
	
	public static void main(String[] args) {
		createNoRegis();
	}

	static void createNoRegis() {
		System.out.println("===========================================");
		System.out.print("Masukkan Nomor: ");
		Scanner input = new Scanner(System.in);
		Integer a = input.nextInt();
			String noregis = String.format("%05d", a);
			System.out.println("No register anda :" + "IBIK" + noregis);	
		}
	}
