package com.archolding.dao;

import com.archolding.model.Mstock;
import java.util.List;

import org.hibernate.query.Query;

public class MovimientoStockDao extends GenericDao<Mstock> {

    public MovimientoStockDao() {
        super(Mstock.class);
    }

    @Override
    public List<Mstock> recuperarPorFiltro(String filtro) {
        session.beginTransaction();
        Query<Mstock> query = session.createQuery("from " + clase.getName() + " "
                + "where lower (descripcion1) like :descripcion1 "
                + "order by id");
        query.setParameter("descripcion1", "%" + filtro.toLowerCase() + "%");
        List<Mstock> results = query.getResultList();
        close();
        return results;
    }
    
        public Mstock recuperarPorIdProducto(Long idProducto) {
        session.beginTransaction();
        Query query = session.createQuery("from " + clase.getName() + " "
                + "where (idproducto) = :idproducto");
        query.setParameter("idproducto", idProducto);

        Mstock stock = (Mstock) query.uniqueResult();
        close();
        return stock;
    }
}
