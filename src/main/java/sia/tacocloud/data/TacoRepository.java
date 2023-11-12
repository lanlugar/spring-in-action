package sia.tacocloud.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sia.tacocloud.Taco;
@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
    Page<Taco> findAll(Pageable page);
}
