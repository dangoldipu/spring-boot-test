package OneToManyDemo.REpositories;
import OneToManyDemo.Entity.Student;
import OneToManyDemo.Repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentResource {


    private final StudentRepository studentRepository;

    StudentResource(StudentRepository studentRepository){this.studentRepository=studentRepository;}

    @GetMapping("{id}")
    public Student findById(@PathVariable Long id){
//        return studentRepository.findById(id);
        Optional<Student> st = studentRepository.findById(id);
        return st.isPresent() ? st.get():null;

    }

    @GetMapping
    public List<Student> findAll(){return studentRepository.findAll();}

    @PostMapping
    public Student insert(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
//        studentRepository.deleteById(id);
        Optional<Student> st = studentRepository.findById(id);
        if(st.isPresent())
            studentRepository.delete(st.get());

    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id,@RequestBody Student student){
        Optional<Student> opStudent=studentRepository.findById(id);
//        Student st= opStudent.isPresent()?opStudent.get():null;
//        st.setName(student.getName());
//        studentRepository.save(st);
        if(opStudent.isPresent()){
            Student st= opStudent.get();
            st.setName(student.getName());
        }
    }


}
