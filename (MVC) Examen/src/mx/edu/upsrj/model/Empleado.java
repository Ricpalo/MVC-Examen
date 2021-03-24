package mx.edu.upsrj.model;

public class Empleado {
	private int edad;
	private String nombre; 
	private String apellidos;
	private Double salario; 
	private String genero; 
	private String departamentos;
	
	//Getters and Setters
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}
	
}
