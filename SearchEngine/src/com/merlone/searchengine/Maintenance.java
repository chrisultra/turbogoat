package com.merlone.searchengine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.*; 


public class Maintenance extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maintenance frame = new Maintenance();
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
	public Maintenance() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Search Engine - Index Maintenance");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		

		
	    String data[][]={ {"test","test"},  
	    		{"test","test"},  
	    		{"test","test"}};  
	    String column[]={"File Name","Status"};
		

				
		

		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{33, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 0;
		panel_2.add(panel_5, gbc_panel_5);
		
		JButton btnNewButton_1 = new JButton("Add File...");
		panel_5.add(btnNewButton_1);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 0;
		panel_2.add(panel_6, gbc_panel_6);
		
		JButton btnNewButton = new JButton("Rebuild Out-of-date");
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 0, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 3;
		gbc_panel_7.gridy = 0;
		panel_2.add(panel_7, gbc_panel_7);
		
		JButton btnNewButton_2 = new JButton("Remove Selected Files");
		panel_7.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		

		JTable table_3 = new JTable(data, column);
		scrollPane.setViewportView(table_3);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{33, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JButton btnNewButton_3 = new JButton("Reset Windows");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 0;
		panel_8.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.anchor = GridBagConstraints.SOUTH;
		gbc_panel_9.insets = new Insets(0, 0, 0, 5);
		gbc_panel_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_9.gridx = 1;
		gbc_panel_9.gridy = 0;
		panel_8.add(panel_9, gbc_panel_9);
		
		JLabel lblNewLabel_1 = new JLabel("Number of files indexed :");
		panel_9.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		panel_9.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TurboGoat Search Engine v1.0  ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 0;
		panel_8.add(lblNewLabel_3, gbc_lblNewLabel_3);

	    
		

		

		
 
 
	}
}
