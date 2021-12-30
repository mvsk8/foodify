package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Customer;
import ch.zhaw.springboot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "api/customers/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        Optional<Customer> result = this.customerRepository.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<Customer>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "api/customers/byEmail/{email}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomerByEmail(@PathVariable("email") String email) {
        Optional<Customer> result = this.customerRepository.getCustomerByEmail(email);

        if (result.isPresent()) {
            return new ResponseEntity<Customer>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }
}
