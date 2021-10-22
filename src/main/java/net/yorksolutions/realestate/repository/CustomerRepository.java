package net.yorksolutions.realestate.repository;

import net.yorksolutions.realestate.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
