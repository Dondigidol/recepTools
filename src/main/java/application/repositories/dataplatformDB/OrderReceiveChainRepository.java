package application.repositories.dataplatformDB;

import application.entities.Order;
import application.entities.OrderReceiveChain;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface OrderReceiveChainRepository extends PagingAndSortingRepository<OrderReceiveChain, Long> {

    List<OrderReceiveChain> findByShipment(Long shipment);
    List<OrderReceiveChain> findByOrderNo(Long orderNo);
}
