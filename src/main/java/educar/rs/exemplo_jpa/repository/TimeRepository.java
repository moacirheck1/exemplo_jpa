package educar.rs.exemplo_jpa.repository;

import educar.rs.exemplo_jpa.entitty.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TimeRepository extends JpaRepository<Time,Long> {

}
