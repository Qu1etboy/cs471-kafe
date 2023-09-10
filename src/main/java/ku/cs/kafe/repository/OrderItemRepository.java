package ku.cs.kafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {

}
