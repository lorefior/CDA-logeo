package com.escuela.usuario.valido.usuario;
public class Usuario {
	public Usuario() {
		super();
	}
	private String user;
	private String pass;
	private String nombre;
	private String apellido;
	private String mail;
	
	public Usuario(String user, String pass, String nombre, String apellido, String mail, Integer edad) {
		this.user = user;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.edad = edad;
	}
	private Integer edad;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	

}