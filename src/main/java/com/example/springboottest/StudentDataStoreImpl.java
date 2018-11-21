package com.example.springboottest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDataStoreImpl implements StudentDataStore {

    private final Map<Long ,Student > students = new HashMap<>();

    @Override
    public Map<Long,Student> findAll() {return new HashMap<>(students);
    }

    @Override
    public Student findById(Long id) {
        for (Map.Entry<Long, Student> entry : students.entrySet()){
            if(entry.getKey()==id){
                return entry.getValue();
            }

        }
//        for (Student s:students) {
//            if(s.getId()==id)
//                return s;
//            }
            return null;
    }

    @Override
    public Student update(Long id,Student student) {
        final Student st = findById(id);
        if(st!=null) {
            students.remove(st);
            students.put(id,student);
            return student;
        }
        return null;
    }

    @Override
    public Student insert(Long id,Student student) {
        if(students.get(id)==null) {
            students.put(id, student);
            return student;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
//        final Student byId = findById(id);
//        students.remove(byId);
        students.remove(id);
    }
}
