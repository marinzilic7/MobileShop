package movie.shop.repositories;

import movie.shop.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository <Mobile, Long> {}