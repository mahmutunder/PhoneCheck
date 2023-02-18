import java.util.Scanner;

import javax.swing.JOptionPane;

public class PhoneApp {

	public static void main(String[] args) {


		String str;

		Telephone tf = new Telephone();


		str = JOptionPane.showInputDialog("Enter format phone" + "(XXX)XXX-XXXX");


		JOptionPane.showMessageDialog(null, tf.formated(str));


	}

}
