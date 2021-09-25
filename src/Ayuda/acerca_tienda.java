package Ayuda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class acerca_tienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acerca_tienda frame = new acerca_tienda();
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
	public acerca_tienda() {
		setTitle("Acerca de la Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 11, 137, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(181, 76, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 52, 414, 13);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Fabian Jose Solis Villar");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(147, 106, 176, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncerrar.setBounds(181, 227, 89, 23);
		contentPane.add(btncerrar);
	}
}
