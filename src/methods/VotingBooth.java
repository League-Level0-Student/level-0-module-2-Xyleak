package methods;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {

		String Age = JOptionPane.showInputDialog(null, "Are You 18?");

		if(Age.equals("No")) {
			JOptionPane.showMessageDialog(null,"Nobody Cares What You Think");

		}



		if(Age.equals("Yes")) {
			String Vote = JOptionPane.showInputDialog(null,"Who Do You Think Should Be President?");
			JOptionPane.showMessageDialog(null,"You Voted For "+Vote );
		}
	}
}