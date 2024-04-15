package repositories;

import org.springframework.data.jpa.repository.*;
import models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    User getByUsername(String username);
}
