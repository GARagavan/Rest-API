package springbootRESTAPI.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootRESTAPI.Entity.Bean;
@Repository
public interface Repolayer extends JpaRepository<Bean, Integer> {

}
