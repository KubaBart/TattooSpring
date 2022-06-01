package com.example.ztattom.services;

import com.example.ztattom.entities.Role;
import com.example.ztattom.entities.User;
import com.example.ztattom.repository.RoleRepository;
import com.example.ztattom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;

    public void saveUserWithRole(User user)
    {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        Role roleUser = roleRepo.findByName("Klient");
        user.addRole(roleUser);
        userRepo.save(user);
    }

    public List<Role> getRoles()
    {
        return roleRepo.findAll();
    }
}
