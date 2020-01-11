package application.repositories;

import application.entities.OrderInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long> {

}
