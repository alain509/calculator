package calculator;
import java.awt.Window;

import javax.swing.*;

public class playbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame=new JFrame("Calculator");
		
		JLabel nombre1=new JLabel("first");
		JLabel nombre2=new JLabel("second");
		JLabel resultat=new JLabel("resultat:");
		
		
		nombre1.setBounds(50,100,75,25);
		nombre2.setBounds(50,150,75,25);
		resultat.setBounds(180,250,75,25);
		
		JTextField n1=new JTextField();
		JTextField n2=new JTextField();
		
		n1.setBounds(125,100,200,25);
		n2.setBounds(125,150,200,25);
	
		
		JButton addition = new JButton("+");
		JButton soustraction = new JButton("-");
		JButton multiplication = new JButton("/");
		JButton division = new JButton("*");
		
		addition.setBounds(5,200,50,25);
		soustraction.setBounds(100,200,50,25);
		multiplication.setBounds(250,200,50,25);
		division.setBounds(345,200,50,25);
		
		
		frame.add(nombre1);
		frame.add(nombre2);
		frame.add(resultat);
		frame.add(n1);
		frame.add(n2);
		frame.getContentPane().add(addition);
		frame.getContentPane().add(soustraction);
		frame.getContentPane().add(multiplication);
		frame.getContentPane().add(division);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
