package com.example.CustomDBAuthentication.repository;

import com.example.CustomDBAuthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {
     Optional<User> findByUsernameOrEmail(String username,String email);

}
