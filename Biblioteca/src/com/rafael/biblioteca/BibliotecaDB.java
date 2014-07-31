/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rafael.biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class BibliotecaDB {
	List<Libro> libros;
	
	private static BibliotecaDB classInstance;

	private File db;
	private FileOutputStream writer;
	private FileInputStream reader;
	private ObjectOutputStream objectWriter;
	private ObjectInputStream objectReader;
	
	private BibliotecaDB() throws IOException, ClassNotFoundException {
		db = new File("BibliotecaDB.joos");
		
		if(db.exists()) {
			reader = new FileInputStream(db);
			objectReader = new ObjectInputStream(reader);
			libros = (ArrayList<Libro>) objectReader.readObject();
			writer = new FileOutputStream(db);
			objectWriter = new ObjectOutputStream(writer);
		}
		else {
			writer = new FileOutputStream(db);
				objectWriter = new ObjectOutputStream(writer);
				libros = new ArrayList<Libro>();
		}
	}
	
	public static BibliotecaDB getInstance() throws IOException, ClassNotFoundException {
		if (classInstance == null) classInstance = new BibliotecaDB();
		return classInstance;
	}
	
	public void insert(Libro libro) {
		libros.add(libro);
		libro.setId(libros.indexOf(libro));
	}
	
	public void delete(int id) {
		libros.remove(id);
	}
	
	public void update(Libro libro) {
		libros.set(libro.getId(), libro);
	}
	
	public Libro select(int id) {
		return libros.get(id);
	}
	
	public List<Libro> selectAll() {
		return this.libros;
	}
	
	public void commit() throws IOException {
		objectWriter.writeObject(libros);
	}
	
	public void close() throws IOException {
		commit();
		objectWriter.close();
		writer.close();
	}
}
