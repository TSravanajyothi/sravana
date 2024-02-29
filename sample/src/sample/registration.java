package sample;

import java.awt.Component;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(147, 11, 163, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setBounds(96, 36, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setBounds(96, 72, 75, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setBounds(96, 109, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(213, 36, 140, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(213, 69, 140, 20);
		frame.getContentPane().add(p1);
		

		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "EEE", "IT", "MECH", "DS", "CIVIL", "AIML", "CS"}));
		cb1.setBounds(213, 105, 140, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("FEMALE");
		r1.setBounds(215, 144, 75, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("MALE");
		r2.setBounds(292, 144, 61, 23);
		frame.getContentPane().add(r2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYDERABAD", "VIJAYAWADA", "VISHAKHAPATNAM", "KADAPA", "KURNOOL", "WARANGAL", "MAISAMMAGUDA"}));
		cb2.setBounds(213, 181, 140, 22);
		frame.getContentPane().add(cb2);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("GENDER");
		lblNewLabel_5.setBounds(96, 148, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CITY");
		lblNewLabel_6.setBounds(96, 185, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton b1 = new JButton("SUBMIT");
		b1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch= (String) cb1.getSelectedItem();
				String city= (String) cb2.getSelectedItem();
				ButtonGroup rgb=new ButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender="";
				if(r1.isSelected()) {
					gender="female";
				}
				if(r2.isSelected()) {
					gender="male";
				}
				Component btnNewButton = null;
				JOptionPane.showMessageDialog(btnNewButton, "name "+user+"\n branch " + branch + "\ngender "+gender+ "\ncity "+city);
			
			}
		});
		b1.setBounds(174, 214, 89, 23);
		frame.getContentPane().add(b1);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\pho.jpg"));
		lblNewLabel.setBounds(0, 0, 444, 250);
		frame.getContentPane().add(lblNewLabel);
	}
}
