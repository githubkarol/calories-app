package CoolDevelopers.caloriesapp.Controller;

import CoolDevelopers.caloriesapp.DAO.Product;
import CoolDevelopers.caloriesapp.Service.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<List<Product>>(productService.allProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Product>>(productService.getSingleProduct(id), HttpStatus.OK);
    }
}
