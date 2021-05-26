package ma.emsi.tpjpa.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import ma.emsi.tpjpa.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	public Page<Patient> findByNameContains(String name, Pageable pageable);
	public List<Patient> findByMalade(boolean b);
	public List<Patient> findByNameContainsAndMalade(String name,boolean b);

}
