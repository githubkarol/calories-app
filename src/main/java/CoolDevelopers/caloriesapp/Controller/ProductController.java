package CoolDevelopers.caloriesapp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @GetMapping
    public ResponseEntity<String> allProducts() {
        return new ResponseEntity<String>("All the products are here!", HttpStatus.OK);
    }
}
