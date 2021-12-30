package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.*;
import ch.zhaw.springboot.models.ListRequest;
import ch.zhaw.springboot.models.PurchaseRequest;
import ch.zhaw.springboot.repositories.ListRepository;
import ch.zhaw.springboot.repositories.MealRepository;
import ch.zhaw.springboot.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class ListRestController {

    @Autowired
    private ListRepository listRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private MealRepository mealRepository;

    @RequestMapping(value = "api/lists/{id}", method = RequestMethod.GET)
    public ResponseEntity<List> getListById(@PathVariable("id") int id) {
        Optional<List> result = this.listRepository.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<List>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<List>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "api/lists/byPurchase/{id}", method = RequestMethod.GET)
    public ResponseEntity<java.util.List<List>> getListByPurchase(@PathVariable("id") int id) {
        java.util.List<List> result = this.listRepository.getListByPurchase(id);

        if (!result.isEmpty()) {
            return new ResponseEntity<java.util.List<List>>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<java.util.List<List>>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "api/lists/mealForPurchase", method = RequestMethod.POST)
    public ResponseEntity<List> addMealToPurchase(@RequestBody ListRequest lr) {
        try {
            Purchase purchase = this.purchaseRepository.findById(lr.purchaseId).get();
            Meal meal = this.mealRepository.findById(lr.mealId).get();
            List list = this.listRepository.save(new List(purchase, meal));

            return new ResponseEntity<List>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "api/lists/mealForPurchase", method = RequestMethod.DELETE)
    public void deletePost(@RequestBody ListRequest lr) {
        this.listRepository.deleteMealFromPurchase(lr.purchaseId, lr.mealId);
    }
}
