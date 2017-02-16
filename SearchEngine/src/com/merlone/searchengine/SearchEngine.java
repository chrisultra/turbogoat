package com.merlone.searchengine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchEngine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Maintenance newWindow;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEngine frame = new SearchEngine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchEngine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("Search Terms    ");
		panel_6.add(lblNewLabel);
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(60);
		
		JButton btnNewButton = new JButton("Search");
		panel_6.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblFilter = new JLabel("Filter Match : ");
		panel_2.add(lblFilter);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("All");
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Any");
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Exact");
		panel_2.add(rdbtnNewRadioButton_2);
		
		JLabel lblTitlelabel = new JLabel("Search Engine");
		panel_5.add(lblTitlelabel, BorderLayout.NORTH);
		lblTitlelabel.setFont(new Font("Verdana", Font.BOLD, 25));
		
		lblTitlelabel.setHorizontalAlignment(JLabel.CENTER);
		lblTitlelabel.setVerticalAlignment(JLabel.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		panel_3.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("About");
		panel_4.add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("Maintenence");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				
				if(newWindow==null)
				{
		    		newWindow = new Maintenance();
				}
	            newWindow.setVisible(true);
				
			}
		});
		panel_4.add(btnNewButton_3, BorderLayout.WEST);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Number of files indexed :");
		panel_7.add(lblNewLabel_1);
		
		JLabel label = new JLabel("0");
		panel_7.add(label);
		contentPane.add(panel);
	}

}
