package springCrudWithJpa.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springCrudWithJpa.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
