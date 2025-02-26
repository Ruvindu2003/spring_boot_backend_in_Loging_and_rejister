package com.example.RejisterLogin.reporsitory;

import com.example.RejisterLogin.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface UserRepository extends JpaRepository<Userentity, Long> {

}
