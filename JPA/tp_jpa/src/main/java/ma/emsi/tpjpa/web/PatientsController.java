package ma.emsi.tpjpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.tpjpa.entities.Patient;
import ma.emsi.tpjpa.repositories.PatientRepository;

@RestController
public class PatientsController {
	@Autowired
	private PatientRepository patientRepository;

	@GetMapping("/patients")
	public List<Patient> patients(){
		return patientRepository.findAll();
	}
	
	@GetMapping("/patients/{id}")
	public Patient patients(@PathVariable Long id) {
		return patientRepository.findById(id).get();
	}
}
