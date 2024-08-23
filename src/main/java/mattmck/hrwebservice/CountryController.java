package mattmck.hrwebservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mattmck.hrwebservice.service.CountryService;
import mattmck.hrwebservice.service.entity.CountryEntity;

@RestController
public class CountryController {

	private final CountryService countryService;
	
	public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
	
    @GetMapping("/test")
    public String get() {
    	return "OK";
    }

    @GetMapping("/countries")
    public List<CountryEntity> getCountryEntities() {
    	return countryService.getCountryEntities();
    }

    @GetMapping("/countries/{countryId}")
    public CountryEntity getCountryEntity(@PathVariable("countryId") String countryId) {
    	return countryService.getCountryEntity(countryId);
    }
}
