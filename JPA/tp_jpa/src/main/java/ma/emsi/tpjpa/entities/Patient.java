package ma.emsi.tpjpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="PATIENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString 
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // A chq fois +1
	private Long id; 
	@Column(name = "NAME", length = 25) // Pour une colonne. 
	private String name; 
	@Temporal(TemporalType.DATE) // ann de la date
	private Date birthDate; 
	private int score;
	private boolean malade; 
	
		
}
