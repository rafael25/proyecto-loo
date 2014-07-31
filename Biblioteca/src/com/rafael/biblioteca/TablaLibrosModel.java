/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rafael.biblioteca;

import java.io.IOException;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author rafael
 */
public class TablaLibrosModel extends AbstractTableModel {
	private String[] columnNames = {
		"ID", "Titulo", "Autor"
	};
	
	private List<Libro> tableData;
	
	public TablaLibrosModel() {
		super();
		try {
			this.tableData = BibliotecaDB.getInstance().selectAll();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		}
	}

	@Override
	public int getRowCount() {
		return tableData.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	@Override
	public Class getColumnClass(int column) {
		return getValueAt(0, column).getClass();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Libro row = tableData.get(rowIndex);
		
		switch(columnIndex) {
			case 0:
				return row.getId();
			case 1:
				return row.getTitulo();
			case 2:
				return row.getAutor();
			default:
				return "";
		}
	}
}
