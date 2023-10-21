package sia.tacocloud.data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sia.tacocloud.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
