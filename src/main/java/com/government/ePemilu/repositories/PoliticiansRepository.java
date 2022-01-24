package com.government.ePemilu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.government.ePemilu.models.Politicians;

@Repository
public interface PoliticiansRepository extends JpaRepository<Politicians, Long>  {
    Politicians findPoliticiansByNik(String nik);
}
