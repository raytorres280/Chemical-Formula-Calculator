//Author: Raymond Torres
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Frame1 {

	private JFrame frame;
	private JTextField textfieldFormula;
	static JTextArea textArea = new JTextArea(); //static necessary to acess textArea from other classes.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTypeChemicalFormula = new JLabel("Type chemical formula");
		lblTypeChemicalFormula.setBounds(10, 34, 137, 23);
		frame.getContentPane().add(lblTypeChemicalFormula);
		
		textfieldFormula = new JTextField();
		textfieldFormula.setBounds(10, 68, 242, 23);
		frame.getContentPane().add(textfieldFormula);
		textfieldFormula.setColumns(10);
		textArea.setEditable(false);
		
		//JTextArea textArea = new JTextArea(); moving to top so I can append things from other program. 
		textArea.setBounds(311, 167, 242, 183);
		frame.getContentPane().add(textArea);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ff
				String inputFormula = textfieldFormula.getText();
				try {
					double answer = forLoop2.getMatches(inputFormula);
					System.out.println(answer);
					String answer2 = String.valueOf(answer);
					textArea.append(inputFormula + ": " + answer2 + "\n");
				}
				catch(Exception e) {
					textArea.append("Error make sure your formula is correct!\n");
					System.out.println(e.getMessage());
				}
			}
		});
		btnCalculate.setBounds(10, 118, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 167, 242, 183);
		frame.getContentPane().add(scrollPane);
		

	}
}
