package mx.edu.upsrj.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mx.edu.upsrj.controller.EmpleadoController;
import mx.edu.upsrj.model.Empleado;

public class EmpleadoView {
public static void main(String[] args) {
	JFrame ventana = new JFrame();
	ventana.setTitle("Registrar Empleado\n");
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	ventana.setSize(600, 600);
	ventana.setLayout(null);
	
	EmpleadoController empleadoController = new EmpleadoController();
	
	JButton btn_registrar = new JButton("Registrar");
	btn_registrar.setBackground(Color.green);
	btn_registrar.setBounds(0, 300, 300, 300);
	ventana.add(btn_registrar);
	
	JButton btn_listar = new JButton("Listar");
	btn_listar.setBackground(Color.red);
	btn_listar.setBounds(300, 0, 300, 300);
	ventana.add(btn_listar);
	
	JButton btn_modificar = new JButton("Listar");
	btn_listar.setBackground(Color.red);
	btn_listar.setBounds(300, 0, 300, 300);
	ventana.add(btn_listar);
	
	JButton btn_borrar = new JButton("Listar");
	btn_listar.setBackground(Color.red);
	btn_listar.setBounds(300, 0, 300, 300);
	ventana.add(btn_listar);
	
	btn_registrar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int edad  = Integer.parseInt(JOptionPane.showInputDialog(ventana, "Introduce la edad: "));
			if (edad>=18) {
				String nombre = JOptionPane.showInputDialog(ventana, "Escribe el nombre(s): ");
				String apellidos = JOptionPane.showInputDialog(ventana, "Introduce los apellidos: ");
				Double salario = Double.parseDouble(JOptionPane.showInputDialog(ventana, "Introduce el salario: "));
				String genero = JOptionPane.showInputDialog(ventana, "Escribe tu genero: ");
				int tope = Integer.parseInt(JOptionPane.showInputDialog(ventana,"Cuantos departamentos tienes?"));
				String departamentos_n[]= new String[tope];
				
				for(int i=0;i<tope;i++) {
					departamentos_n[i]= JOptionPane.showInputDialog(ventana,"Ingresa el departamento: " + (i+1));
				}
				String totalDepartamentos ="";
				for (String texto : departamentos_n) {
					totalDepartamentos += texto + "\n";
				}
				
				Empleado empleado = new Empleado();
				empleado.setNombre(nombre);
				empleado.setApellidos(apellidos);
				empleado.setEdad(edad);
				empleado.setSalario(salario);
				empleado.setGenero(genero);
				empleado.setDepartamentos(totalDepartamentos);
				
				empleadoController.guardarEmpleado(empleado);
			}
			else {
				JOptionPane.showMessageDialog(ventana, "No puedes ingresar datos sin no tienes 18 o mas\n");
			}
			
		}
	});
	btn_listar.addActionListener(new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			empleadoController.ListarEmpleados();
		}
	});
	btn_modificar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			List<Empleado> empleado = empleadoController.lista_Empleados();
			
			
		}
	});
	ventana.setVisible(true); 
}
}
