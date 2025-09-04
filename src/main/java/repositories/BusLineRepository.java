package repositories;

import entities.BusLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusLineRepository extends JpaRepository<BusLine, Long> {

}
