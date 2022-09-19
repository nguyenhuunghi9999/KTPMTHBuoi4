package repository;

import entity.ChuyenBay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
    List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
}


