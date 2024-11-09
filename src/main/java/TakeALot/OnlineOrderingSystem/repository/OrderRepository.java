package TakeALot.OnlineOrderingSystem.repository;


import TakeALot.OnlineOrderingSystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
