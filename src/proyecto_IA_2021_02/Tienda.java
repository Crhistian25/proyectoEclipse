package proyecto_IA_2021_02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ayuda.acerca_tienda;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Mantenimiento.Consulta;
import Mantenimiento.Listar;
import Mantenimiento.Modificar;
import Ventas.Generar_reportes;
import Ventas.Vender;
import Configuracion.configurar_cantidad_optima;
import Configuracion.configurar_cuota_diaria;
import Configuracion.configurar_descuentos;
import Configuracion.configurar_obsequios;
import Ayuda.acerca_tienda;

public class Tienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jArchivo = new JMenu("Archivo");
		menuBar.add(jArchivo);
		
		JMenuItem jSalir = new JMenuItem("Salir");
		jSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		jArchivo.add(jSalir);
		
		JMenu jMatenimiento = new JMenu("Mantenimiento");
		menuBar.add(jMatenimiento);
		
		JMenuItem jConDisco = new JMenuItem("Consultar disco duro");
		jConDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta con = new Consulta();
				con.setVisible(true);
			}
		});
		jMatenimiento.add(jConDisco);
		
		JMenuItem jMoDisco = new JMenuItem("Modificar disco duro");
		jMoDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificar mo = new Modificar();
				mo.setVisible(true);
			}
		});
		jMatenimiento.add(jMoDisco);
		
		JMenuItem jLisDisco = new JMenuItem("Listar discos duros");
		jLisDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar li = new Listar();
				li.setVisible(true);
			}
		});
		jMatenimiento.add(jLisDisco);
		
		JMenu jVentas = new JMenu("Ventas");
		menuBar.add(jVentas);
		
		JMenuItem jVender = new JMenuItem("Vender");
		jVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vender vd = new Vender();
				vd.setVisible(false);
			}
		});
		jVentas.add(jVender);
		
		JMenuItem jGeReportes = new JMenuItem("Generar reportes");
		jGeReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generar_reportes gr = new Generar_reportes();
				gr.setVisible(true);
			}
		});
		jVentas.add(jGeReportes);
		
		JMenu jConfiguracion = new JMenu("Configuracion");
		menuBar.add(jConfiguracion);
		
		JMenuItem jConDescuento = new JMenuItem("Configurar descuentos");
		jConDescuento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurar_descuentos cf = new configurar_descuentos();
				cf.setVisible(true);
			}
		});
		jConfiguracion.add(jConDescuento);
		
		JMenuItem jConObsequio = new JMenuItem("Configurar obsequios");
		jConObsequio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurar_obsequios co = new configurar_obsequios();
				co.setVisible(true);
			}
		});
		jConfiguracion.add(jConObsequio);
		
		JMenuItem jConCantidad = new JMenuItem("Configurar cantidad \u00F3ptima");
		jConCantidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurar_cantidad_optima cc = new configurar_cantidad_optima();
				cc.setVisible(true);
			}
		});
		jConfiguracion.add(jConCantidad);
		
		JMenuItem jConCuota = new JMenuItem("Configurar cuota diaria");
		jConCuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurar_cuota_diaria cd = new configurar_cuota_diaria();
				cd.setVisible(true);
			}
		});
		jConfiguracion.add(jConCuota);
		
		JMenu jAyuda = new JMenu("Ayuda");
		menuBar.add(jAyuda);
		
		JMenuItem jAcercaTienda = new JMenuItem("Acerca de la Tienda");
		jAcercaTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acerca_tienda at = new acerca_tienda();
				at.setVisible(true);
			}
		});
		jAyuda.add(jAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
