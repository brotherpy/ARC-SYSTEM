package com.archolding.dao;

import com.archolding.model.Dclasificacion;
import java.util.List;

import org.hibernate.query.Query;


public class ClasificacionProductosDao extends GenericDao<Dclasificacion>{

	public ClasificacionProductosDao() {
		super(Dclasificacion.class);
	}

	@Override
	public List<Dclasificacion> recuperarPorFiltro(String filtro) {
		session.beginTransaction();
		Query<Dclasificacion> query = session.createQuery("from "+clase.getName()+" "
				+ "where lower (descripcion) like :descripcion "
				+ "order by id");
		query.setParameter("descripcion", "%"+filtro.toLowerCase()+"%");
		List<Dclasificacion> results = query.getResultList();
		close();
		return results;
	}

}
