package com.c0demode.Trippy.repository;

import com.c0demode.Trippy.model.Traveller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravellerRepository extends JpaRepository<Traveller, Long> {

}
