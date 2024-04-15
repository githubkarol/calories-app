package CoolDevelopers.caloriesapp.Service;

import CoolDevelopers.caloriesapp.DAO.Product;
import CoolDevelopers.caloriesapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> allProducts() {
        return  productRepository.findAll();
    }
}
