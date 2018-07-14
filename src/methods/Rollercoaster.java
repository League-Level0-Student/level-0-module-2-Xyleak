
package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {

		String Height =JOptionPane.showInputDialog(null, "About How Tall Are You? (OPTIONS: 10 in, 50 in, 100 in");{
			{
				if(Height.equals("10 in")) JOptionPane.showMessageDialog(null,"YOU'RE TOO SHORT!!!");
			}

			{
				if(Height.equals("50 in"))JOptionPane.showMessageDialog(null, "You May Go On The RollerCoaster");
			}

			{
				if(Height.equals("100 in"))JOptionPane.showMessageDialog(null, "YOU ARE TOO TALL!!!");
			}
		}
	}
}
