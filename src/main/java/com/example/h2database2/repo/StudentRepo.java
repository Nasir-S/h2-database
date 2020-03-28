package com.example.h2database2.repo;

import com.example.h2database2.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
