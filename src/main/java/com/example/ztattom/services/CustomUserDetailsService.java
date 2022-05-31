package com.example.ztattom.services;


import com.example.ztattom.details.CustomUserDetails;
import com.example.ztattom.entities.User;
import com.example.ztattom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email);
        if(user == null) throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(user);
    }

}
