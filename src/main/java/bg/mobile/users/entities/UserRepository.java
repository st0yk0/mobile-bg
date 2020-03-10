package bg.mobile.users.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository< User, String> {

    Optional<User> findByUsernameAndPassword(String username, String password);
}
