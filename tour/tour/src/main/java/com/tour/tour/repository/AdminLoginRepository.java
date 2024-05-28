package com.tour.tour.repository;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tour.tour.model.AdminLogin;
import com.tour.tour.model.Register;

@Repository
@Qualifier("admRepo")
public interface AdminLoginRepository  extends JpaRepository<AdminLogin, Long>{
	@Query(nativeQuery = true,value="select * from adminlogin where emailid=:emailid and password=:password")
	AdminLogin findByEmailIdAndPassword(@Param("emailid")String emailid,@Param("password")String password);
}
