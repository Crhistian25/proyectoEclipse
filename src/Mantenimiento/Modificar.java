package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar extends JFrame {

	private JPanel contentPane;
	private JTextField txtprecioM;
	private JTextField txtanchoM;
	private JTextField txtaltoM;
	private JTextField txtfondoM;
	private JTextField txtcapacidadM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar frame = new Modificar();
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
	public Modificar() {
		setTitle("Modificar Disco Duro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(25, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(25, 65, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(25, 102, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(25, 135, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(25, 170, 73, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Capacidad (TB)");
		lblNewLabel_5.setBounds(25, 209, 115, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox cbomodeloM = new JComboBox();
		cbomodeloM.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String detalles=(String)cbomodeloM.getSelectedItem();
				if(detalles.equals("Western Digital My Cloud Home 6TB")) {
					txtprecioM.setText("1499.0");
					txtanchoM.setText("14.0");
					txtaltoM.setText("5.3");
					txtfondoM.setText("17.5");
					txtcapacidadM.setText("6");
				}
				if(detalles.equals("Western Digital Elements 4TB")) {
					txtprecioM.setText("555.0;");
					txtanchoM.setText("11.5");
					txtaltoM.setText("8.2");
					txtfondoM.setText("2.1;");
					txtcapacidadM.setText("4");
				}
				if(detalles.equals("Toshiba Canvio Basics 4TB")) {
					txtprecioM.setText("499.0");
					txtanchoM.setText("14.1");
					txtaltoM.setText("11.1");
					txtfondoM.setText("3.8");
					txtcapacidadM.setText("4");
				}
				if(detalles.equals("Seagate Expansion 4TB")) {
					txtprecioM.setText("619.0");
					txtanchoM.setText("11.7");
					txtaltoM.setText("8.0");
					txtfondoM.setText("2.1");
					txtcapacidadM.setText("4");
				}
				if(detalles.equals("Seagate Backup Plus Hub 10TB")) {
					txtprecioM.setText("1099.0");
					txtanchoM.setText("19.8");
					txtaltoM.setText("11.8");
					txtfondoM.setText("4.1");
					txtcapacidadM.setText("10");
				}
			}
		});
		cbomodeloM.setBounds(161, 22, 210, 22);
		contentPane.add(cbomodeloM);
		
		txtprecioM = new JTextField();
		txtprecioM.setColumns(10);
		txtprecioM.setBounds(161, 62, 210, 20);
		contentPane.add(txtprecioM);
		
		txtanchoM = new JTextField();
		txtanchoM.setColumns(10);
		txtanchoM.setBounds(161, 99, 210, 20);
		contentPane.add(txtanchoM);
		
		txtaltoM = new JTextField();
		txtaltoM.setColumns(10);
		txtaltoM.setBounds(161, 132, 210, 20);
		contentPane.add(txtaltoM);
		
		txtfondoM = new JTextField();
		txtfondoM.setColumns(10);
		txtfondoM.setBounds(161, 167, 210, 20);
		contentPane.add(txtfondoM);
		
		txtcapacidadM = new JTextField();
		txtcapacidadM.setColumns(10);
		txtcapacidadM.setBounds(161, 206, 210, 20);
		contentPane.add(txtcapacidadM);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncerrar.setBounds(381, 49, 89, 23);
		contentPane.add(btncerrar);
		
		cbomodeloM.addItem("Seleccione un producto");
		cbomodeloM.addItem("Western Digital My Cloud Home 6TB");
		cbomodeloM.addItem("Western Digital Elements 4TB");
		cbomodeloM.addItem("Toshiba Canvio Basics 4TB");
		cbomodeloM.addItem("Seagate Expansion 4TB");
		cbomodeloM.addItem("Seagate Backup Plus Hub 10TB");
		
	}

}
