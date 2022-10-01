import java.util.Scanner;

public class Latihan09 {
	
	public static void main(String[] args) {
		Tester myProgram = new Tester();

        System.out.println("===SELAMAT DATANG==== \n");
        System.out.println("===SILAHKAN ISI DATA DIRI ANDA===\n");
        
        myProgram.InputStudents();
    }

    void InputStudents() {
    	Students myBio = new Students();
    	myBio.data();
        Scanner valueInput = new Scanner(System.in);
        
        // variabel untuk input data oleh user
        int NPM, Semester;
        float GPA;
        String FullName, ClassName;
    
        // variabel untuk menyimpan data masukkan oleh user
        int objNPM, objSemester;
        float objGPA;
        String objFullName, objClassName;

        System.out.print("Masukkan NPM = ");
        NPM = valueInput.nextInt();
        objNPM = myBio.getNPM(NPM);

        valueInput.nextLine();
        
        System.out.print("Masukkan nama lengkap Anda = ");
        FullName = valueInput.nextLine();
        objFullName = myBio.getFullName(FullName);

        System.out.print("Masukkan kelas Anda = ");
        ClassName = valueInput.nextLine();
        objClassName = myBio.getClassName(ClassName);

        System.out.print("Masukkan semester Anda = ");
       Semester = valueInput.nextInt();
        objSemester = myBio.getSemester(Semester);

        System.out.print("Masukkan GPA / IPK Anda = ");
        GPA = valueInput.nextFloat();
        objGPA = myBio.getGPA(GPA);

        OutputStudents(objNPM, objFullName, objClassName, objSemester, objGPA);

        valueInput.close();
    }

    void OutputStudents(int val_NPM, String val_FullName, String val_ClassName, int val_Semester, float val_GPA) {
    	System.out.print("\n");
    	
        System.out.println("NPM            : " + val_NPM);
        System.out.println("Nama Lengkap   : " + val_FullName);
        System.out.println("Kelas          : " + val_ClassName);
        System.out.println("Semester       : " + val_Semester);
        System.out.println("GPA / IPK      : " + val_GPA);
    }

}




	
	