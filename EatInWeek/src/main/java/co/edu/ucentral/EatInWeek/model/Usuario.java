package co.edu.ucentral.EatInWeek.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	private String id;
	private String nombre;
	private String correo;
	private int celular;
	private String clave;
	private int tipo;

	public Usuario(String correo, int celular, String clave) {
		super();
		this.correo = correo;
		this.celular = celular;
		this.clave = clave;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String id, String correo, int celular, String clave, String nombre) {
		super();
		this.id = id;
		this.correo = correo;
		this.celular = celular;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", celular=" + celular + ", clave="
				+ clave + ", tipo=" + tipo + "]";
	}

	

}
