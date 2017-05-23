package com.archolding.dao;

import com.archolding.model.Dproductos;
import java.util.List;

import org.hibernate.query.Query;


public class ProductosDao extends GenericDao<Dproductos>{

	public ProductosDao() {
		super(Dproductos.class);
	}

	@Override
	public List<Dproductos> recuperarPorFiltro(String filtro) {
		session.beginTransaction();
		Query<Dproductos> query = session.createQuery("from "+clase.getName()+" "
				+ "where lower (descripcion1) like :descripcion1 "
				+ "order by id");
		query.setParameter("descripcion1", "%"+filtro.toLowerCase()+"%");
		List<Dproductos> results = query.getResultList();
		close();
		return results;
	}

}
