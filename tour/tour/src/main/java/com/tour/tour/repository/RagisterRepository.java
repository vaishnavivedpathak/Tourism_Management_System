package com.tour.tour.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tour.tour.model.Register;

@Repository
@Qualifier("regRepo")
public interface RagisterRepository extends JpaRepository<Register, Long>   {
//query for login 
	@Query(nativeQuery = true,value="select * from register where emailid=:emailid and password=:password")
Register findByEmailIdAndPassword(@Param("emailid")String emailid,@Param("password")String password);
}

