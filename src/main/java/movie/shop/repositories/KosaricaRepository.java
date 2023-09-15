package movie.shop.repositories;

import movie.shop.model.Kosarica;
import movie.shop.model.Mobile;
import movie.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KosaricaRepository extends JpaRepository  <Kosarica, Long>{
    Kosarica findByCreatedByAndMobile(User createdBy, Mobile mobile);
    List<Kosarica> findByCreatedBy(User createdBy);
}
