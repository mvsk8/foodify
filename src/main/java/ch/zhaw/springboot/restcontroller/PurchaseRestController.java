package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Customer;
import ch.zhaw.springboot.entities.Deliverer;
import ch.zhaw.springboot.entities.Postcode;
import ch.zhaw.springboot.entities.Purchase;
import ch.zhaw.springboot.models.PurchaseRequest;
import ch.zhaw.springboot.repositories.CustomerRepository;
import ch.zhaw.springboot.repositories.DelivererRepository;
import ch.zhaw.springboot.repositories.PostcodeRepository;
import ch.zhaw.springboot.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PurchaseRestController {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private DelivererRepository delivererRepository;
	
	@Autowired
	private PostcodeRepository postcodeRepository;

	@RequestMapping(value = "api/purchases", method = RequestMethod.POST)
	public ResponseEntity<Purchase> createPurchase(@RequestBody PurchaseRequest pr) {
		try {
			Customer customer = this.customerRepository.findById(pr.customerId).get();
			Deliverer deliverer = this.delivererRepository.findById(pr.delivererId).get();
			Postcode postcode = this.postcodeRepository.findById(pr.postcodeId).get();
			Purchase purchase = this.purchaseRepository.save(new Purchase(pr.createTs, pr.purchaseTs, pr.street, postcode, deliverer, customer));
			
			return new ResponseEntity<Purchase>(purchase, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Purchase>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}