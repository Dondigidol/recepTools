package application.repositories;

import application.entities.OrderInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Repository
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long> {

    List<OrderInfo> findByItem(String lm);
    List<OrderInfo> findByOrderNo(int orderNo);
    List<OrderInfo> findByOrderNoAndItem(Integer orderNo, String lm);
    List<OrderInfo> findByLocation(int location);
    List<OrderInfo> findByCreatedDateContaining(Date date);

}
