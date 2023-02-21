package ro.tuc.ds2020.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.tuc.ds2020.entities.Person;
import ro.tuc.ds2020.entities.Users;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {

    /**
     * Example: JPA generate Query by Field
     */
    List<Users> findByUsername(String username);

    /**
     * Example: Write Custom Query
     */
    @Query(value = "SELECT p " +
            "FROM Users p " +
            "WHERE p.username = :username " )
    Optional<Users> findUsers(@Param("username") String username);

    @Query(value = "SELECT p FROM Users p WHERE p.username = :username")
    Users findUserByUsername(@Param("username") String username);

}
