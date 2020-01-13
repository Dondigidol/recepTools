package application.repositories;

import application.entities.OrderInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Repository
@Qualifier("dataplatfromEntityManager")
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long> {

    List<OrderInfo> findByStoreAndItem(Integer store, String lm);
    List<OrderInfo> findByOrderNo(Integer orderNo);
    List<OrderInfo> findByOrderNoAndItem(Integer orderNo, String lm);
    List<OrderInfo> findByStoreAndCreatedDateContaining(Integer store, Date date);

}
