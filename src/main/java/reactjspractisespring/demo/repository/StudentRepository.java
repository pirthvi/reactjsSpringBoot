package reactjspractisespring.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import reactjspractisespring.demo.model.StudentModel;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel,Integer> {
    List<StudentModel> findAll();
}
