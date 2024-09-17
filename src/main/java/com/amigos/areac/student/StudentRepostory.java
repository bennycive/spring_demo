package com.amigos.areac.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepostory extends JpaRepository<Student ,Long> {

}
