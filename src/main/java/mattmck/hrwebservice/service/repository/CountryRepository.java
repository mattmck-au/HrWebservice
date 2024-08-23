package mattmck.hrwebservice.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mattmck.hrwebservice.service.entity.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, String> {}