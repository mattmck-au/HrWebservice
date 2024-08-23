package mattmck.hrwebservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mattmck.hrwebservice.service.entity.CountryEntity;
import mattmck.hrwebservice.service.repository.CountryRepository;

@Service
public class CountryService {

	private final CountryRepository countryRepository;

	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	public CountryEntity getCountryEntity(String countryId) {
		return countryRepository.findById(countryId).orElseThrow(() -> new RuntimeException("Entity not found"));
	}
	
	public List<CountryEntity> getCountryEntities() {
		return countryRepository.findAll();
	}
}
