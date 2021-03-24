package mx.edu.upsrj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import mx.edu.upsrj.model.Empleado;

public class EmpleadoController {
	private List<Empleado> empleado = new ArrayList<Empleado>();
	public void guardarEmpleado(Empleado empleados) {
		empleado.add(empleados);
		JOptionPane.showMessageDialog(null, "Empleado Registrado\n");
	}
	public void ListarEmpleados() {
		String concatenar = "";
		for (Empleado empleado2 : empleado) {
			concatenar += "\nNombre:\n"+ empleado2.getNombre()+"\nApellidos:\n"+empleado2.getApellidos()+"\nEdad: \n"+empleado2.getEdad()+"\nSalario:\n"+empleado2.getSalario()+"\nGenero:\n"+empleado2.getGenero()+"\nDepartamentos\n"+empleado2.getDepartamentos();
		}
		JOptionPane.showMessageDialog(null, concatenar);
	}
	public List<Empleado> lista_Empleados()
	{
		return empleado;
	}
}
