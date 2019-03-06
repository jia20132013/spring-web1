package com.jia.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jia.spring.model.User;
import com.jia.spring.repository.UserRepository;
import java.sql.Date;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataJpaApplication.class, args);
	}

	@Bean
    public CommandLineRunner loadSampleData(UserRepository repo) {
        return args -> { 

//            repo.save(new User("user003", 10, "yes", "26347",   Date.valueOf("1987-06-17"), "Steven King", "Steven", "King", 12, 203, "Neena Kochhar", Date.valueOf("1989-09-21")));
//            repo.save(new User("user002", 20, "no",  "83546",   Date.valueOf("1993-01-13"), "Lex De",       "Lex",   "De",   15, 501,  "Valli Patablla",Date.valueOf("1997-06-05")));
        	
        	repo.save(User.builder().userId("user003").Id(10)
        			.active("yes").cecId("26347").createdDt(Date.valueOf("1987-06-17"))
        			.createdBy("Steven King").firstName("Steven").lastName("King").region(12).theater(203).updatedBy("Neena Kochhar").updatedDt(Date.valueOf("1989-09-21")).build());
        			
        			
        	repo.save(User.builder().userId("user002").Id(20)
        			.active("no").cecId("83546").createdDt(Date.valueOf("1993-01-13"))
        			.createdBy("Lex De").firstName("Lex").lastName("De").region(15).theater(501).updatedBy("Valli Patalla").updatedDt(Date.valueOf("1997-06-05")).build());
        					
        			
        	
        	
        };
    }
	
}

