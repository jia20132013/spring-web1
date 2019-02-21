package com.jia.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.jia.spring.model.*;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User,Long>  {
	
	User findByUserId(String userId);

}
