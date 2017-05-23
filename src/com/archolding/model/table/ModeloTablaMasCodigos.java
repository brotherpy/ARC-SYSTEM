package com.archolding.model.table;

import com.archolding.model.Dcodigos;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class ModeloTablaMasCodigos extends AbstractTableModel{
	
	private String[] columnas = {"Codigo", "Cantidad","Precio"};
	private Object[][] datos = new Object[0][columnas.length]; 
	
	public void setLista(List<Dcodigos> cadenas) {
		datos = new Object[cadenas.size()][columnas.length];
		
		for (int i = 0; i < cadenas.size(); i++) {
			datos[i][0] = cadenas.get(i).getCodigobarra();
			datos[i][1] = cadenas.get(i).getCantidad();
			datos[i][2] = cadenas.get(i).getPrecio();
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
