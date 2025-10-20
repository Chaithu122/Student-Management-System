package com.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.Web.Model.Student;
import com.Web.Repository.StudentRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
