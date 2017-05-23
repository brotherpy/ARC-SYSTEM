package com.archolding.model.table;

import com.archolding.model.Dproductos;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class ModeloTablaProducto extends AbstractTableModel{
	
	private String[] columnas = {"Id", "Descripcion", "Codigo Barra","P.Compra","P.Venta","Activo"};
	private Object[][] datos = new Object[0][columnas.length]; 
	
	public void setLista(List<Dproductos> productos) {
		datos = new Object[productos.size()][columnas.length];
		
		for (int i = 0; i < productos.size(); i++) {
			datos[i][0] = productos.get(i).getId();
//			datos[i][1] = productos.get(i).getDescripcion();
//			datos[i][2] = productos.get(i).getCodigoBarra();
//			datos[i][3] = productos.get(i).getPrecioCompra();
//			datos[i][4] = productos.get(i).getPrecioVenta();
//			datos[i][5] = productos.get(i).getActivo();

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
	
	@Override
	public Class<?> getColumnClass(int c) {
		if(c == 5) return Boolean.class;
		
		return super.getColumnClass(c);
	}

}
