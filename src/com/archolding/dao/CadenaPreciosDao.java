package com.archolding.dao;

import com.archolding.model.Dcadena;
import java.util.List;

import org.hibernate.query.Query;


public class CadenaPreciosDao extends GenericDao<Dcadena>{

	public CadenaPreciosDao() {
		super(Dcadena.class);
	}

	@Override
	public List<Dcadena> recuperarPorFiltro(String filtro) {
		session.beginTransaction();
		Query<Dcadena> query = session.createQuery("from "+clase.getName()+" "
				+ "where lower (descripcion) like :descripcion "
				+ "order by id");
		query.setParameter("descripcion", "%"+filtro.toLowerCase()+"%");
		List<Dcadena> results = query.getResultList();
		close();
		return results;
	}

}
