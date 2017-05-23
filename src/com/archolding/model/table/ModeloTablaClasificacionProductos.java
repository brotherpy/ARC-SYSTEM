package com.archolding.model.table;

import com.archolding.model.Dclasificacion;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class ModeloTablaClasificacionProductos extends AbstractTableModel{
	
	private String[] columnas = {"Codigo", "Descripcion"};
	private Object[][] datos = new Object[0][columnas.length]; 
	
	public void setLista(List<Dclasificacion> cadenas) {
		datos = new Object[cadenas.size()][columnas.length];
		
		for (int i = 0; i < cadenas.size(); i++) {
			datos[i][0] = cadenas.get(i).getId();
			datos[i][1] = cadenas.get(i).getDescripcion();
		}
		
		//Refrezca la vista de la tabla
		fireTableDataChanged();
	}

	@Override
	public String getColumnName(int column) {
		return columnas[column];
	}
	
	@Override
	public int getRowCount() {
		return datos.length;
	}

	@Override
	public int getColumnCount() {
		return columnas.length;
	}

	@Override
	public Object getValueAt(int f, int c) {
		return datos[f][c];
	}
	
}
