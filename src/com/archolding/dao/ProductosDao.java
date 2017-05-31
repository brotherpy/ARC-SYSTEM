package com.archolding.dao;

import com.archolding.model.Dproductos;
import java.util.List;

import org.hibernate.query.Query;

public class ProductosDao extends GenericDao<Dproductos> {

    public ProductosDao() {
        super(Dproductos.class);
    }

    @Override
    public List<Dproductos> recuperarPorFiltro(String filtro) {
        session.beginTransaction();
        Query<Dproductos> query = session.createQuery("from " + clase.getName() + " "
                + "where lower (descripcion1) like :descripcion1 "
                + "order by id");
        query.setParameter("descripcion1", "%" + filtro.toLowerCase() + "%");
        List<Dproductos> results = query.getResultList();
        close();
        return results;
    }

    public Dproductos recuperarPorCodigoBarra(String codeBar) {
        session.beginTransaction();
        Query query = session.createQuery("from " + clase.getName() + " "
                + "where (codbarra) = :codbarra");
        query.setParameter("codbarra", codeBar);

        Dproductos producto = (Dproductos) query.uniqueResult();
        close();
        return producto;
    }

    public Long recuperarUltimoID() {
        session.beginTransaction();
        Long query = (Long) session.createQuery("SELECT max(id) FROM " + clase.getName() + " ")
                .getSingleResult();
        if(query==null){
            query = Long.parseLong("0");
        }
        close();
        return query;
    }
}
