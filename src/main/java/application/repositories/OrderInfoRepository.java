package application.repositories;

import application.entities.OrderInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long> {

    //@Query("Select o.item, o.order_no, o.location, o.qty_ordered, o.created_dttm From OrderInfo o Where o.item = ?1")
    List<OrderInfo> findByItem(String lm);

}
