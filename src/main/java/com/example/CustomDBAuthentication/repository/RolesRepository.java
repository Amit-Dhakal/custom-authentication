package com.example.CustomDBAuthentication.repository;

import com.example.CustomDBAuthentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role,Integer> {





}
