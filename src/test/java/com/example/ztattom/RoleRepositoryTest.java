package com.example.ztattom;


import com.example.ztattom.entities.Role;
import com.example.ztattom.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace =
        AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RoleRepositoryTest {
    @Autowired
    RoleRepository repo;
    @Test
    public void testCreateRole()
    {
        Role klient = new Role("Klient");
        Role tatuator = new Role("Tatuator");
        repo.saveAll(List.of(klient,tatuator));
        List<Role> listRoles = repo.findAll();
        assertThat(listRoles.size()).isEqualTo((2));
    }
}
