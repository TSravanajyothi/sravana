package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ecommerce {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecommerce window = new Ecommerce();
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
	public Ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-COMMERCE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(166, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel ll1 = new JLabel("$ 250");
		ll1.setForeground(Color.WHITE);
		ll1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		ll1.setBounds(20, 193, 46, 14);
		frame.getContentPane().add(ll1);
		
		JLabel ll2 = new JLabel("$ 550");
		ll2.setForeground(Color.WHITE);
		ll2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		ll2.setBounds(141, 193, 46, 14);
		frame.getContentPane().add(ll2);
		
		JLabel ll3 = new JLabel("$770");
		ll3.setForeground(Color.WHITE);
		ll3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		ll3.setBounds(292, 193, 46, 14);
		frame.getContentPane().add(ll3);
		
		JLabel l1 = new JLabel("cart : 0");
		l1.setForeground(Color.PINK);
		l1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		l1.setBounds(316, 11, 91, 14);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton,"no.of items are : "+items+ "\n\ntotal bill : "+bill);
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(330, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton b1 = new JButton("New button");
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\babyy1.png"));
		b1.setBounds(10, 43, 121, 139);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book1.jpg"));
		b2.setBounds(141, 43, 131, 139);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("New button");
		b3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\babyy3.png"));
		b3.setBounds(282, 43, 125, 139);
		frame.getContentPane().add(b3);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+250;
				l1.setText("cart : "+items);
				
			}
			
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+550;
				l1.setText("cart : "+items);
				
			}
			
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+770;
				l1.setText("cart : "+items);
				
			}
			
		});
		
	}

}
