package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField txtprecio;
	private JTextField txtancho;
	private JTextField txtalto;
	private JTextField txtfondo;
	private JTextField txtcapacidad;
	
	/**Declaraciones de formulario**/
	// Datos mínimos del primer disco duro
	public static String modelo0 = "Western Digital My Cloud Home 6TB";
	public static double precio0 = 1499.0;
	public static double fondo0 = 14.0;
	public static double ancho0 = 5.3;
	public static double alto0 = 17.5;
	public static double capacidad0 = 6;
	// Datos mínimos del segundo disco duro
	public static String modelo1 = "Western Digital Elements 4TB";
	public static double precio1 = 555.0;
	public static double ancho1 = 11.5;
	public static double alto1 = 8.2;
	public static double fondo1 = 2.1;
	public static double capacidad1 = 4;
	// Datos mínimos del tercer disco duro
	public static String modelo2 = "Toshiba Canvio Basics 4TB";
	public static double precio2 = 499.0;
	public static double ancho2 = 14.1;
	public static double alto2 = 11.1;
	public static double fondo2 = 3.8;
	public static double capacidad2 = 4;
	// Datos mínimos del cuarto disco duro
	public static String modelo3 = "Seagate Expansion 4TB";
	public static double precio3 = 619.0;
	public static double ancho3 = 11.7;
	public static double alto3 = 8.0;
	public static double fondo3 = 2.1;
	public static double capacidad3 = 4;
	// Datos mínimos del quinto disco duro
	public static String modelo4 = "Seagate Backup Plus Hub 10TB";
	public static double precio4 = 1099.0;
	public static double ancho4 = 19.8;
	public static double alto4 = 11.8;
	public static double fondo4 = 4.1;
	public static double capacidad4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setTitle("Consultar Disco Duro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(21, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(21, 62, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(21, 99, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(21, 132, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(21, 167, 73, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Capacidad (TB)");
		lblNewLabel_5.setBounds(21, 206, 115, 14);
		contentPane.add(lblNewLabel_5);
		
		txtprecio = new JTextField();
		txtprecio.setEditable(false);
		txtprecio.setBounds(157, 59, 210, 20);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtancho = new JTextField();
		txtancho.setEditable(false);
		txtancho.setBounds(157, 96, 210, 20);
		contentPane.add(txtancho);
		txtancho.setColumns(10);
		
		txtalto = new JTextField();
		txtalto.setEditable(false);
		txtalto.setBounds(157, 129, 210, 20);
		contentPane.add(txtalto);
		txtalto.setColumns(10);
		
		txtfondo = new JTextField();
		txtfondo.setEditable(false);
		txtfondo.setBounds(157, 164, 210, 20);
		contentPane.add(txtfondo);
		txtfondo.setColumns(10);
		
		txtcapacidad = new JTextField();
		txtcapacidad.setEditable(false);
		txtcapacidad.setBounds(157, 203, 210, 20);
		contentPane.add(txtcapacidad);
		txtcapacidad.setColumns(10);
		
		JComboBox cbomodelo = new JComboBox();
		cbomodelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String detalles=(String)cbomodelo.getSelectedItem();
				if(detalles.equals("Western Digital My Cloud Home 6TB")) {
					txtprecio.setText("1499.0");
					txtancho.setText("14.0");
					txtalto.setText("5.3");
					txtfondo.setText("17.5");
					txtcapacidad.setText("6");
				}
				if(detalles.equals("Western Digital Elements 4TB")) {
					txtprecio.setText("555.0;");
					txtancho.setText("11.5");
					txtalto.setText("8.2");
					txtfondo.setText("2.1;");
					txtcapacidad.setText("4");
				}
				if(detalles.equals("Toshiba Canvio Basics 4TB")) {
					txtprecio.setText("499.0");
					txtancho.setText("14.1");
					txtalto.setText("11.1");
					txtfondo.setText("3.8");
					txtcapacidad.setText("4");
				}
				if(detalles.equals("Seagate Expansion 4TB")) {
					txtprecio.setText("619.0");
					txtancho.setText("11.7");
					txtalto.setText("8.0");
					txtfondo.setText("2.1");
					txtcapacidad.setText("4");
				}
				if(detalles.equals("Seagate Backup Plus Hub 10TB")) {
					txtprecio.setText("1099.0");
					txtancho.setText("19.8");
					txtalto.setText("11.8");
					txtfondo.setText("4.1");
					txtcapacidad.setText("10");
				}
				
			}
		});
		cbomodelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cbomodelo.setBounds(157, 19, 210, 22);
		contentPane.add(cbomodelo);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(377, 46, 89, 23);
		contentPane.add(btnNewButton);
		
		cbomodelo.addItem("Seleccione un producto");
		cbomodelo.addItem("Western Digital My Cloud Home 6TB");
		cbomodelo.addItem("Western Digital Elements 4TB");
		cbomodelo.addItem("Toshiba Canvio Basics 4TB");
		cbomodelo.addItem("Seagate Expansion 4TB");
		cbomodelo.addItem("Seagate Backup Plus Hub 10TB");
		
	}
}
