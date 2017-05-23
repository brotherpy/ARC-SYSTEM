package com.archolding.model.table;

import com.archolding.model.Dproductos;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class ModeloTablaBuscadorProducto extends AbstractTableModel{
	
	private String[] columnas = {"Codigo", "Descripcion", "P. Venta1","P. Venta2","Costo Net", "Clasificacion", "UFMov", "UCant"};
	private Object[][] datos = new Object[0][columnas.length]; 
	
	public void setLista(List<Dproductos> productos) {
		datos = new Object[productos.size()][columnas.length];
		
		for (int i = 0; i < productos.size(); i++) {
			datos[i][0] = productos.get(i).getId();
			datos[i][1] = productos.get(i).getDescripcion1();
			datos[i][2] = productos.get(i).getPrecioventa();
			datos[i][3] = productos.get(i).getPrecioventa2();
			datos[i][4] = productos.get(i).getCostoneto();
			datos[i][5] = productos.get(i).getClasificacion().getDescripcion();
			datos[i][6] = productos.get(i).getUfmov();
			datos[i][7] = productos.get(i).getUcant();

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
