package com.amigos.areac.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepostory extends JpaRepository<Student ,Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1 ")
    static Optional<Student> findStudentByEmail(String email) {
        return Optional.empty();
    }

}
