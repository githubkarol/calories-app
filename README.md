# Calories-app

calories-app is a Java_17 and ReactJS_18 application that calculates calories.

It uses MongoDB database

https://calories-app-calc.netlify.app/

## Installation

Use the Maven to build the project.

```bash
mvn package
```
Start application in your IDE, it will run on localhost:8080

```jsunicoderegexp
localhost:8080
```

## Usage
Endpoints:
`localhost:8080/api/v1/products`

Return all products:

`getAllProducts()`
```java
 public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<List<Product>>(productService.allProducts(), HttpStatus.OK);
    }
```
Return one product with given id:

`getProduct()`
```java
("/{id}")
public ResponseEntity<Optional<Product>> getProduct(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Product>>(productService.getSingleProduct(id), HttpStatus.OK);
        }
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)