package com.example.ztattom;

import com.example.ztattom.entities.User;
import com.example.ztattom.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class FindByEmailTest {

    UserRepository userRepo;
    @Test
    public void testUserByEmail()
    {
        String email = "kuba@o2.pl";

        User user = userRepo.findByEmail(email);
        assertThat(user).isNotNull();
    }

}
