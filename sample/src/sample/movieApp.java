package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieApp {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieApp window = new movieApp();
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
	public movieApp() {
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
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APPLICATION");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(135, 21, 189, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(85, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(85, 112, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("N0.OF TICKETS");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(85, 157, 100, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setToolTipText("enter your name");
		tb1.setBounds(194, 61, 169, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(Color.WHITE);
		cb1.setForeground(Color.BLACK);
		cb1.setToolTipText("select movie name");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "KALKI"}));
		cb1.setBounds(194, 108, 169, 22);
		frame.getContentPane().add(cb1);
		
		JButton b1 = new JButton("BUY NOW");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("SALAAR")){
					bill=nt*200;
					
				}
				if(movie.equals("KALKI")) {
					bill=nt*250;
				}
				int res=0;
				Component btnNewButton = null;
				res=JOptionPane.showConfirmDialog(btnNewButton, "name: "+user+"\nmovie name:  "+movie+ "\nno.of tickets : "+ tickets+ "\nbill : "+bill);
				if(res==JOptionPane.YES_OPTION) {
					JOPtionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED!! ");
					tb1.setText("");
					cb1.setSelectedItem("");
				}
				else {
					JOPtionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED!! ");
				}
			}
		});
		b1.setToolTipText("");
		b1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(173, 209, 89, 23);
		frame.getContentPane().add(b1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setForeground(Color.BLACK);
		cb2.setToolTipText("select no.of tickets");
		cb2.setBackground(Color.WHITE);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cb2.setBounds(195, 153, 168, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\m1.jpg"));
		lblNewLabel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(lblNewLabel);
	}
}
