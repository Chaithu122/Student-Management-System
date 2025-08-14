package com.Web.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Web.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	

}
