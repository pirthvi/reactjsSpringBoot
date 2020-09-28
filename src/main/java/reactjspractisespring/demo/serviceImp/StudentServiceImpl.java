package reactjspractisespring.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactjspractisespring.demo.model.StudentModel;
import reactjspractisespring.demo.repository.StudentRepository;
import reactjspractisespring.demo.services.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService
{  @Autowired
   StudentRepository studentRepository;

    @Override
    public StudentModel create(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public StudentModel update(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public void delete(StudentModel studentModel) {
         studentRepository.delete(studentModel);
    }

    @Override
    public List<StudentModel> getAll() {
        return studentRepository.findAll();
    }
}
