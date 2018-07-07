package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	
    public static void main(String[] args) {
		

		
	
	
      Random randomMaker = new Random();
      
      int rand = randomMaker.nextInt(10);
      int rand2 = randomMaker.nextInt(10); 
      int rand3 = randomMaker.nextInt(10);
      int rand4 = randomMaker.nextInt(10);
      int RAND = randomMaker.nextInt(10);

      JOptionPane.showMessageDialog(null, "The Following Are Possible Lottery Numbers");
      JOptionPane.showMessageDialog(null, "" +rand);
      JOptionPane.showMessageDialog(null, "" +rand2);
      JOptionPane.showMessageDialog(null, "" +rand3);
      JOptionPane.showMessageDialog(null, "" +rand4);
      JOptionPane.showMessageDialog(null, "" +RAND);

}
}