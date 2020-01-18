package com.nubteam.inventario.pojo;

public class ArticulosPOJO {

	//Variables privadas
	private String articulo;
	private String descripcion;
	private String tipo;
	private String estado;
	private String fecha;
	
	//Constructor por defecto en clase POJO
	public ArticulosPOJO() {}

	
	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
