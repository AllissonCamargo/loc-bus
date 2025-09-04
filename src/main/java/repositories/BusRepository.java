package repositories;

import entities.Bus;
import entities.BusLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByLineId(Long lineId);
}
