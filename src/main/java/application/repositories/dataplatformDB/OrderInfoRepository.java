package application.repositories.dataplatformDB;

import application.entities.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderInfoRepository extends PagingAndSortingRepository<Order, Long> {

    List<Order> findByStoreAndItem(Integer store, String lm);
    List<Order> findByOrderNo(Integer orderNo);
    List<Order> findByOrderNoAndItem(Integer orderNo, String lm);
    List<Order> findByStoreAndCreatedDateContaining(Integer store, Date date);

}
