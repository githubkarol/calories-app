# calories-app

calories-app is a Java_17 and ReactJS_18 application that calculates calories.

It uses MongoDB database hosted on AWS

## Installation

Use the Maven to build the project.

```bash
mvn package
```

## Usage

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class CaloriesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaloriesAppApplication.class, args);
	}
}
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)