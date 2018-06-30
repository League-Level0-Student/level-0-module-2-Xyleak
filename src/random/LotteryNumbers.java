package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	
    public static void main(String[] args) {
		

		
	
	
      Random randomMaker = new Random();
      
      int rand = randomMaker.nextInt(9);
      int rand2 = randomMaker.nextInt(9); 
      int rand3 = randomMaker.nextInt(9);
      int rand4 = randomMaker.nextInt(9);
      int RAND = randomMaker.nextInt(9);


      JOptionPane.showMessageDialog(null, "");
      

}
}