package reactjspractisespring.demo.services;

import reactjspractisespring.demo.model.StudentModel;

import java.util.List;

public interface StudentService {
    StudentModel create(StudentModel studentModel);
    StudentModel update(StudentModel studentModel);
    void delete(StudentModel studentModel);
    List<StudentModel> getAll();
}
