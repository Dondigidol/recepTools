package application.repositories.dataplatformDB;

import application.entities.Shipment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, List> {

    @Query("Select shipment From Shipment as shipment Left Join OrderReceiveChain as orderR ON orderR.shipment = shipment.shipment Where shipment.shipment=:id")
    List<Shipment> findById(@Param("id")Long id);

    List<Shipment> findByLm(String lm);

    List<Shipment> findByIdAndLm(long id, String lm);
}
