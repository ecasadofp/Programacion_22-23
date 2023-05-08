package org.example.Datos;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import org.example.Aplicacion.Alumno;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import org.example.Aplicacion.AlumnoModulo;
import org.example.Aplicacion.Modulo;
import org.example.Aplicacion.Profesor;

import java.sql.SQLException;

public class GestionBd {

        ConnectionSource conSrc;


        // En este caso la bd se llama modulos
        public GestionBd(String bd) throws SQLException {
            conSrc = new JdbcConnectionSource("jdbc:mysql://db-programacion-ej1.cbved7bhnvqz.us-east-1.rds.amazonaws.com/" +bd, "admin","piramide" );

        }

        public void guardaAlumnoBD(Alumno a) throws SQLException {

            Dao<Alumno,Integer> alumnoDao = DaoManager.createDao(conSrc,Alumno.class);
            alumnoDao.create(a);

        }

        public void guardaModulo(Modulo m) throws SQLException {

            Dao<Modulo,String> moduloDao = DaoManager.createDao(conSrc, Modulo.class);
            moduloDao.create(m);
        }

        public Profesor getProfesor(int nrp) throws SQLException {

            Dao<Profesor, Integer> profesorDao  = DaoManager.createDao(conSrc, Profesor.class);
            Profesor profesor = profesorDao.queryForId(nrp);
            return profesor;
        }

        public Modulo getModulo(String nombre) throws SQLException {

            Dao<Modulo, String> moduloDao = DaoManager.createDao(conSrc,Modulo.class);
            Modulo modulo = moduloDao.queryForId(nombre);
            return modulo;

        }

        public void guardaAlumnoModulo(AlumnoModulo am) throws SQLException {

            Dao<AlumnoModulo,Object> alumnoModuloDao = DaoManager.createDao(conSrc, AlumnoModulo.class);
            alumnoModuloDao.create(am);

        }

    }



