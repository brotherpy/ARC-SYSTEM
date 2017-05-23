package com.archolding.dao;

import com.archolding.model.Dcodigos;
import java.util.List;

import org.hibernate.query.Query;


public class MasCodigosDao extends GenericDao<Dcodigos>{

	public MasCodigosDao() {
		super(Dcodigos.class);
	}

	@Override
	public List<Dcodigos> recuperarPorFiltro(String filtro) {
		session.beginTransaction();
		Query<Dcodigos> query = session.createQuery("from "+clase.getName()+" "
				+ "where lower (descripcion) like :descripcion "
				+ "order by id");
		query.setParameter("descripcion", "%"+filtro.toLowerCase()+"%");
		List<Dcodigos> results = query.getResultList();
		close();
		return results;
	}

}
