package com.government.ePemilu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.government.ePemilu.models.Voters;

@Repository
public interface VotersRepository extends JpaRepository<Voters, Long> {
    Voters findVotersByNik(String nik);
}
