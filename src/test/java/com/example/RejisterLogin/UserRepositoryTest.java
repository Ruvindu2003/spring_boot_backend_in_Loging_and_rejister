package com.example.RejisterLogin;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.RejisterLogin.dto.User;
import com.example.RejisterLogin.entity.Userentity;
import com.example.RejisterLogin.reporsitory.UserRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE  )
@Rollback(value = false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EntityManager entityManager;
    @Test
    public void tesCrateUser(){
        Userentity userentity=new Userentity();
        userentity.setEmail("Sharadharuvindu@gmail.com");
        userentity.setPassword("95087443");
        userentity.setFirstname("Ruvindu");
        userentity.setLastname("Sharadha");

     User  saveUser=userRepository.save(userentity);
      User exituser=  entityManager.find(Userentity.class,saveUser.getId());
        assertThat(component).isNotNull();

    }

}
