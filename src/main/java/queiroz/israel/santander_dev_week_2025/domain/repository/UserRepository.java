package queiroz.israel.santander_dev_week_2025.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import queiroz.israel.santander_dev_week_2025.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
