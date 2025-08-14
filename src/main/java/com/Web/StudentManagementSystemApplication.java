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
		/*Student s1=new Student( "chaithu", "pigilapu", "chaithu@gmail.com");
		studentRepository.save(s1);
		
		Student s2=new Student( "pawan", "muppala", "pawan@gmail.com");
		studentRepository.save(s2);
		
		Student s3=new Student( "abhilesh", "pigilapu", "abhi@gmail.com");
		studentRepository.save(s3);*/
		
		
		
	}

}
