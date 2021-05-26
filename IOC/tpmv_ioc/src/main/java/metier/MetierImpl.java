package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service(value="metier")
public class MetierImpl implements IMetier {
	/*
	 * Couplage faible 
	 */
	@Autowired
	private IDao dao=null;
	@Override
	public double calcul() {
		double d = dao.getData();
		double res = d*23;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection des depandances");
	}
	public void init() {
		System.out.println("Instanciationde Metier Impl");
	}
}
