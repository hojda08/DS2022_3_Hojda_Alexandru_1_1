package ro.tuc.ds2020.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.tuc.ds2020.entities.Devices;
import ro.tuc.ds2020.entities.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Devices, UUID> {

    /**
     * Example: JPA generate Query by Field
     */
    List<Devices> findByName(String name);

    /**
     * Example: Write Custom Query
     */
    @Query(value = "SELECT p " +
            "FROM Devices p " +
            "WHERE p.name = :name ")
    Optional<Devices> findDevices(@Param("name") String name);

    @Query(value = "SELECT p FROM Devices p WHERE p.name = :name")
    Devices findDeviceByName(@Param("name") String name);

}
