package com.archolding.dao;

import com.archolding.model.Mstock;
import java.time.Instant;
import java.util.Date;
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
                + "where lower (idproducto) like :idproducto "
                + "order by id");
        query.setParameter("idproducto", filtro);
        List<Mstock> results = query.getResultList();
        close();
        return results;
    }

    public List<Mstock> recuperarListaPorIdProducto(Long filtro) {
        session.beginTransaction();
        Query<Mstock> query = session.createQuery("from " + clase.getName() + " "
                + "where idproducto = " + filtro);
        List<Mstock> results = query.getResultList();
        close();
        return results;
    }

    public Mstock recuperarPorIdProducto(Long idProducto) {
        session.beginTransaction();
        Query query = session.createQuery("from " + clase.getName() + " "
                + "where idproducto = " + idProducto);
        Mstock stock = (Mstock) query.uniqueResult();
        close();
        return stock;
    }
}
