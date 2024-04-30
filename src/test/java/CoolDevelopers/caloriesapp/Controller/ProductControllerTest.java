package CoolDevelopers.caloriesapp.Controller;

import CoolDevelopers.caloriesapp.DAO.Product;
import CoolDevelopers.caloriesapp.Service.ProductService;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void getAllProducts() throws Exception {
        // Given
        Product product1 = new Product("Egg");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Apple");
        when(productService.allProducts()).thenReturn(Arrays.asList(product1, product2, product3));

        // When & Then
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/products").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"name\":\"Egg\"},{\"name\":\"Bread\"}, {\"name\":\"Apple\"}]"));
    }

    @Test
    void getProduct() throws Exception {
        // Given
        Product product1 = new Product(ObjectId.get(), "Egg");
        when(productService.getSingleProduct(product1.getProductId())).thenReturn(Optional.of(product1));

        // Then
        mockMvc.perform(MockMvcRequestBuilders.get("api/v1/products/{id}").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"productId\":1, \"name\":\"Egg\"}]"));
    }
}