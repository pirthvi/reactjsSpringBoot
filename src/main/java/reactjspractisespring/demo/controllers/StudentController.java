package reactjspractisespring.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactjspractisespring.demo.dto.StudentDTO;
import reactjspractisespring.demo.model.StudentModel;
import reactjspractisespring.demo.services.StudentService;
import reactjspractisespring.demo.transformer.StudentTransformer;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/getAll")
    public ResponseEntity<List<StudentDTO>> getAll(){
        List<StudentDTO> dtos=new ArrayList<>();
      List<StudentModel> models=studentService.getAll();
      for(StudentModel ss:models){
          dtos.add(StudentTransformer.getDTO(ss));
      }
       return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
    @PostMapping("/create")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public StudentDTO create(@RequestBody StudentDTO student){
        System.out.println("reached");
        return StudentTransformer.getDTO(studentService.create(StudentTransformer.createToModel(student)));
    }
    @PostMapping("/update")
    @CrossOrigin(origins = {"*"})
    public StudentDTO update(@RequestBody StudentDTO student){
        return StudentTransformer.getDTO(studentService.update(StudentTransformer.createToModel(student)));
    }
    @GetMapping("/delete/{id}")
    @CrossOrigin(origins = {"*"})
    public String delete(@PathVariable(name = "id") String id){
        StudentModel studentModel= new StudentModel();
        studentModel.setId(Integer.parseInt(id));
        studentService.delete(studentModel);
        return "";
    }
}
