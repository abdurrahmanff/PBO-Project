package id.ac.its.fauzan231;
import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		String inputanString[] = new String[3];
		
		//rectangle
		inputanString[0] =
				JOptionPane.showInputDialog("Enter Rectangle's height");
		inputanString[1] =
				JOptionPane.showInputDialog("Enter Rectangle's widht");
		
		Rectangle rect = new Rectangle (Integer.parseInt(inputanString[0]), 
				Integer.parseInt(inputanString[1]));
		
		JOptionPane.showMessageDialog(null, 
				"The area of rectangle is " + rect.getArea() +
				"\nThe circumference of rectangle is " + rect.getCircumference(), 
				"Rectangle", JOptionPane.PLAIN_MESSAGE);
		
		//circle
		inputanString[2] =
				JOptionPane.showInputDialog("Enter Circle's radius");
		
		Circle circ = new Circle (Integer.parseInt(inputanString[2]));
		
		JOptionPane.showMessageDialog(null, 
				"The area of circle is " + circ.getArea() + 
				"\nThe circumference of circle is " + circ.getCircumference(), 
				"Circle", JOptionPane.PLAIN_MESSAGE);
	}
}