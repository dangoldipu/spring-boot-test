package com.example.springboottest;

import java.util.List;
import java.util.Map;

public interface StudentDataStore {
    Map<Long,Student> findAll();

    Student findById(Long id);

    Student update(Long id,Student student);

    Student insert(Long id,Student student);

    void delete(Long id);
}

