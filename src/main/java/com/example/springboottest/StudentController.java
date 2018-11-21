package com.example.springboottest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentDataStore studentDataStore;

    public StudentController(){
        studentDataStore= new StudentDataStoreImpl();
    }

    @PostMapping("{id}")
    public Student insert(@PathVariable Long id,@RequestBody Student Student)
    {
        return studentDataStore.insert(id,Student);
    }

    @GetMapping
    public Map<Long,Student> findAll() {

        return studentDataStore.findAll();
    }

    @GetMapping("{id}")
    public Student findById(@PathVariable Long id){
        return studentDataStore.findById(id);
    }

    @PutMapping("{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return studentDataStore.update(id,student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        studentDataStore.delete(id);
    }


}
