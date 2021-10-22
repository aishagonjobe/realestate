package net.yorksolutions.realestate.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.yorksolutions.realestate.model.Customers;
import net.yorksolutions.realestate.model.RealEstate;
import net.yorksolutions.realestate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping ("/all")
    String getAllCustomers () throws JsonProcessingException{
        return objectMapper.writeValueAsString(customerRepository.findAll());
    }

    @GetMapping ("/getByRowAmount")
    String getRealEstateByRows (@RequestParam("rows") String rows) throws JsonProcessingException {
        List<Customers> customerList = (List<Customers>) customerRepository.findAll();
        customerList = customerList.stream().limit(Long.parseLong(rows)).collect(Collectors.toList());
        return objectMapper.writeValueAsString(customerList);
    }
    @PostMapping("/add")
    String postCustomer (@RequestBody String body){
        try {
            Customers customers = objectMapper.readValue(body, Customers.class);
            customerRepository.save(customers);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
        return "success";
    }
}
