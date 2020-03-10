package bg.mobile.extras.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExtraRepository extends JpaRepository<Extra, String> {

    Optional<Extra> findByName(String name);

}
