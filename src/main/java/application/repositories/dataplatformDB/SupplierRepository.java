package application.repositories.dataplatformDB;

import application.entities.Supplier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Long> {
    @Query("Select supplier From Supplier supplier Where is_actual='1' and supplier.id =:id")
     List<Supplier> findById(@Param("id") long id);
}
