package application.repositories;

import application.entities.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RejectRepository extends PagingAndSortingRepository<Item, Long> {

}
