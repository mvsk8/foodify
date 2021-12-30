package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Town;
import ch.zhaw.springboot.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TownRestController {

    @Autowired
    private TownRepository townRepository;

    @RequestMapping(value = "api/towns", method = RequestMethod.GET)
    public ResponseEntity<List<Town>> getAllTowns() {
        List<Town> result = this.townRepository.findAll();

        if (!result.isEmpty()) {
            return new ResponseEntity<List<Town>>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Town>>(HttpStatus.NOT_FOUND);
        }
    }
}
