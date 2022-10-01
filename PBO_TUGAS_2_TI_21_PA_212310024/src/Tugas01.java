import javax.swing.JOptionPane;

class Students {
	private int NPM;
	
	public int getNPM() {
		return NPM;
	}
	
	public void setNPM(int npm1) {
		NPM = npm1;
	}
}

public class Tugas01 {

	static Students myBio = new Students();
	
	public static void main(String[] args) {
		String NPM = JOptionPane.showInputDialog(null, "masukan no MPM mu :  ");
		
		if(NPM.isEmpty()) {
			JOptionPane.showMessageDialog(null, "NPM tidak boleh kosong", "Error Message", JOptionPane.ERROR_MESSAGE);
		} else if(NPM.length() > 5) {
			JOptionPane.showMessageDialog(null, "Minimum 1 digit dan maximum 5 digit", "Error Message", JOptionPane.WARNING_MESSAGE);
		} else {
			int NPMsuks = Integer.parseInt(NPM);
			myBio.setNPM(NPMsuks);
			JOptionPane.showMessageDialog(null, "Your NPM is " + myBio.getNPM(), "Success", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
}
