package reactjspractisespring.demo.transformer;

import reactjspractisespring.demo.dto.StudentDTO;
import reactjspractisespring.demo.model.StudentModel;

public class StudentTransformer {
    public static StudentModel createToModel(StudentDTO studentDTO){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(studentDTO.getName());
        studentModel.setDepartment(studentDTO.getDepartment());
        if(studentDTO.getId()!=null && studentDTO.getId()!="") {
            studentModel.setId(Integer.parseInt(studentDTO.getId()));
        }
        return studentModel;
    }
    public static StudentDTO getDTO(StudentModel model){
        StudentDTO studentDTO= new StudentDTO();
        if(model.getId()!=null){
            studentDTO.setId(model.getId().toString());
        }
        studentDTO.setName(model.getName());
        studentDTO.setDepartment(model.getDepartment());
        return studentDTO;

    }
}
