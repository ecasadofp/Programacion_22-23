package org.example;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class Main {
    public static void main(String[] args) {

        Deporte miDeporte = new Deporte("Petanca");
        Deporte otroDeporte = new Deporte("Bolos");

        ODB miOdb = ODBFactory.open("ejemplo1.odb");

        miOdb.store(miDeporte);

        IQuery consulta = new CriteriaQuery(Deporte.class, Where.equal("nombre","Petanca"));

        Objects <Deporte> deportes = miOdb.getObjects(Deporte.class);

        while(deportes.hasNext())
            System.out.println(deportes.next());
        miOdb.close();
    }
}