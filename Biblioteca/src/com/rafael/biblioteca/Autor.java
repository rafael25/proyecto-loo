/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rafael.biblioteca;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author rafael
 */
public class Autor implements Serializable {
	private int id;
	private String nombre;
	private String nacionalidad;
	private Date nacimiento;
	private Date muerte;

	public Autor() {}

	public Autor(String nombre, String nacionalidad, Date nacimiento, Date muerte) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.nacimiento = nacimiento;
		this.muerte = muerte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Date getMuerte() {
		return muerte;
	}

	public void setMuerte(Date muerte) {
		this.muerte = muerte;
	}

	@Override
	public String toString() {
		return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
	}
}
