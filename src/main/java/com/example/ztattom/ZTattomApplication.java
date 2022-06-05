package com.example.ztattom;

import com.example.ztattom.entities.Role;
import com.example.ztattom.entities.User;
import com.example.ztattom.repository.RoleRepository;
import com.example.ztattom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ZTattomApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZTattomApplication.class, args);

    }

}
