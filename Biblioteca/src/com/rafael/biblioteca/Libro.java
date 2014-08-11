/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rafael.biblioteca;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Files;

/**
 *
 * @author rafael
 */
public class Libro implements Serializable {
	private int id;
	private String titulo;
	private Autor autor;
	private String resumen;
	private File archivo;
	private byte[] contenido;
	
	public Libro() {}

	public Libro(String titulo, Autor autor, String resumen, File archivo) throws IOException {
		this.titulo = titulo;
		this.autor = autor;
		this.resumen = resumen;
		this.archivo = archivo;
		
		leerContenido();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	
	private void leerContenido() throws IOException {
		Path p = FileSystems.getDefault().getPath(archivo.getName());
		contenido = Files.readAllBytes(p);
	}
	
	public void escribirContenido(File archivo) throws IOException {
		FileOutputStream fos = new FileOutputStream(archivo);
		fos.write(contenido);
		fos.flush();
		fos.close();
	}

	@Override
	public String toString() {
		return "Libro{" + "id=" + id + ", titulo=" + titulo + ", resumen=" + resumen + '}';
	}
}
