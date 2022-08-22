package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;
import model.UserRole;

public interface UserRepo extends JpaRepository<User, Integer> {
	User findByPersonNummerAndPasswordAndRole(String personNummer, String password, UserRole userRole);
	Optional<User> findByPersonNummer(String personNummer);
}
