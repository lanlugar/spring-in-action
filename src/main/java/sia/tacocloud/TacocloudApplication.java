package sia.tacocloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import sia.tacocloud.data.IngredientRepository;

import sia.tacocloud.Ingredient.Type;

@SpringBootApplication
@ComponentScan({"sia.tacocloud.*"})
public class TacocloudApplication implements ApplicationRunner {
    @Autowired
    private IngredientRepository ingredientRepository;

    public static void main(String[] args) {
        SpringApplication.run(TacocloudApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ingredientRepository.save(new Ingredient("FLTO", "Flour", Type.WRAP));
        ingredientRepository.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
        ingredientRepository.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
        ingredientRepository.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
        ingredientRepository.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
        ingredientRepository.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
        ingredientRepository.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
        ingredientRepository.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
        ingredientRepository.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
        ingredientRepository.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
    }
}
