package sia.tacocloud;

import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import sia.tacocloud.Ingredient.Type;
import sia.tacocloud.data.IngredientRepository;
import sia.tacocloud.data.TacoRepository;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"sia.tacocloud.*"})
public class TacocloudApplication implements ApplicationRunner {
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private TacoRepository tacoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TacocloudApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var flourTortilla = ingredientRepository.save(new Ingredient("FLTO", "Flour", Type.WRAP));
        var cornTortilla = ingredientRepository.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
        var groundBeef = ingredientRepository.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
        var carnitas = ingredientRepository.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
        var tomatoes = ingredientRepository.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
        var lettuce = ingredientRepository.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
        var cheddar = ingredientRepository.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
        var jack = ingredientRepository.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
        var salsa = ingredientRepository.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
        var sourCream = ingredientRepository.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));

        Taco taco1 = new Taco();
        taco1.setName("Carnivore");
        taco1.setIngredients(Arrays.asList(
                flourTortilla, groundBeef, carnitas,
                sourCream, salsa, cheddar));
        tacoRepository.save(taco1);
        Taco taco2 = new Taco();
        taco2.setName("Bovine Bounty");
        taco2.setIngredients(Arrays.asList(
                cornTortilla, groundBeef, cheddar,
                jack, sourCream));
        tacoRepository.save(taco2);
        Taco taco3 = new Taco();
        taco3.setName("Veg-Out");
        taco3.setIngredients(Arrays.asList(
                flourTortilla, cornTortilla, tomatoes,
                lettuce, salsa));
        tacoRepository.save(taco3);
    }
}
