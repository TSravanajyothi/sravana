package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel lblNewLabel_1 = new JLabel("METRO TICKET BOOKING");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(113, 26, 229, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(89, 51, 62, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SOURCE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(89, 95, 82, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DESTINATION");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(89, 138, 117, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NO.OF TICKETS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(89, 178, 145, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(232, 50, 154, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"JUBLEEHILLS", "PARADISE"}));
		cb1.setBounds(232, 93, 154, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"JUBLEEHLLS", "PARADISE"}));
		cb2.setBounds(232, 136, 154, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cb3.setBounds(232, 176, 154, 22);
		frame.getContentPane().add(cb3);
		
		JButton b1 = new JButton("BOOK TICKETS NOW");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source =(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination)) {
					Component btnNewButton = null;
					JOPtionPane.showMessageDialog(btnNewButton, "please check stations !!");
				}
				else {
					bill=bill+45*nt;
					Component btnNewButton = null;
					JOPtionPane.showMessageDialog(btnNewButton, "name: "+name+"\n source: "+source+"\n destination: "+destination+"\no.of tickets : "+nt+"\namount: "+bill);
				}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		b1.setBounds(163, 209, 154, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\pexels-photo-302428.jpeg"));
		lblNewLabel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(lblNewLabel);
	}

}
