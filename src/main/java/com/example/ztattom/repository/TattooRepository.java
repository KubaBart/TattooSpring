package com.example.ztattom.repository;

import com.example.ztattom.entities.Tattoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface TattooRepository extends JpaRepository<Tattoo,Long> {

    @Query("SELECT t FROM Tattoo t WHERE t.name = ?1")
    public Tattoo findByName(String name);
}
