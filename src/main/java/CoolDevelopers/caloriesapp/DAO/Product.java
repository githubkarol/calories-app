package CoolDevelopers.caloriesapp.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private ObjectId productId;
    private String name;
    private String category;
    private List<String> uses;
    private int energy;
    private double carbo;
    private double fat;
    private double protein;

}
