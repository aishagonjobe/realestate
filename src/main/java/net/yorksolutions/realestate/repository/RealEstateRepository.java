package net.yorksolutions.realestate.repository;

import net.yorksolutions.realestate.model.RealEstate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {
}
