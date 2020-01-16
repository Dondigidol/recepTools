package application.repositories.dataplatformDB;

import application.entities.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Long> {

    List<Shipment> findByShipmentId(Long id);

    List<Shipment> findByLm(String lm);

    List<Shipment> findByIdAndLm(long id, String lm);
}
