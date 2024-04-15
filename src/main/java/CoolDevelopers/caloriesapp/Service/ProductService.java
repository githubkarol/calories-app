package CoolDevelopers.caloriesapp.Service;

import CoolDevelopers.caloriesapp.DAO.Product;
import CoolDevelopers.caloriesapp.Repository.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> allProducts() {
        return  productRepository.findAll();
    }

    public Optional<Product> getSingleProduct(ObjectId id) {
        return productRepository.findById(id);
    }
}
