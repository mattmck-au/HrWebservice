package mattmck.hrwebservice.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COUNTRIES")
public class CountryEntity {

	@Id
	@Column(name = "COUNTRY_ID")
	String countryId;
	
	@Column(name = "COUNTRY_NAME")
	String countryName;
	
	@Column(name = "REGION_ID")
	Integer regionId;
}
