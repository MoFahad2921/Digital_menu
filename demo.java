package test;
import javax.swing.JOptionPane;

public class demo {
public static void main(String[] args) {
		
		int quantityadult;
		int quantitykid;
		int totalB;
	    int totalA; 
	    int total;
		String input;
		
		
		JOptionPane.showMessageDialog(null," Adult lunch set will cost $20");
		JOptionPane.showMessageDialog(null," Kids lunch set will cost $12");
		
		input = JOptionPane.showInputDialog("How many adult sets would you like to buy?");
		
		quantityadult = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How many kids sets would you like to buy?");
		
		quantitykid = Integer.parseInt(input);
		
		totalA = quantityadult*20;
		totalB = quantitykid*12;
		total = totalA + totalB;
		int newtotal1 = total+4; 
		int newtotal2 = total+5;
		JOptionPane.showMessageDialog(null,"Your total will be $"+total);
		
		int answer=JOptionPane.showConfirmDialog(null,"Would like to buy a side order?"); 
			
		 if (answer== JOptionPane.NO_OPTION){	
				JOptionPane.showMessageDialog(null,"Kindly pay $"+total + " at the counter.Thanks and good day!");	
	     }	
		 
		 else if (answer== JOptionPane.YES_OPTION){	
				JOptionPane.showMessageDialog(null,"Salad will cost $4 and Dessert will cost $5");	
		
				
				String buttons[] = {"salad","dessert"};
         int answer1 = JOptionPane.showOptionDialog(null,"choose side order","salad($4),dessert($5)",JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, buttons);
		 
		 if (answer1== 0) { 
		    JOptionPane.showMessageDialog(null,"your new total will be $"+newtotal1);
		 }	
		 else if (answer1== 1) {
    		 JOptionPane.showMessageDialog(null, "your new total will be $"+newtotal2);	
		 
		 }
		 JOptionPane.showMessageDialog(null,"Kindly pay at the counter. Thanks and good day!");
	
			     
         }}}


