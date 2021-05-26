package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {

	
	public double getData() {
		/*
		 * Cnx a la bdd
		 */
		double data = 98;
		return data;
	}

	public void init() {
		System.out.println("Instanciationde Dao Impl");
	}
}
