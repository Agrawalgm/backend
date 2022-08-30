package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.beans.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
