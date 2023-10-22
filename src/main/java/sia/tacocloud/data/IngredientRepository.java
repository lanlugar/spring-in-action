package sia.tacocloud.data;


import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
