package com.example.ztattom.services;


import com.example.ztattom.details.CustomUserDetails;
import com.example.ztattom.entities.User;
import com.example.ztattom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    private User user;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        user = userRepo.findByEmail(email);
        if(user == null) throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(user);
    }

    public User getCurrentlyLoggedIn(Authentication authentication)
    {
        if(authentication == null)
            return null;
        User user = null;
        Object principal = authentication.getPrincipal();
        if(principal instanceof CustomUserDetails)
        {
            user = ((CustomUserDetails) principal).getUser();

        }
        return user;
    }

}
