package com.archolding.dao;

import com.archolding.model.Ddepositos;
import java.util.List;

import org.hibernate.query.Query;


public class DepositosDao extends GenericDao<Ddepositos>{

	public DepositosDao() {
		super(Ddepositos.class);
	}

	@Override
	public List<Ddepositos> recuperarPorFiltro(String filtro) {
		session.beginTransaction();
		Query<Ddepositos> query = session.createQuery("from "+clase.getName()+" "
				+ "where lower (descripcion) like :descripcion "
				+ "order by id");
		query.setParameter("descripcion", "%"+filtro.toLowerCase()+"%");
		List<Ddepositos> results = query.getResultList();
		close();
		return results;
	}

}
