package com.government.ePemilu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.government.ePemilu.models.Candidates;

@Repository
public interface CandidatesRepository extends JpaRepository<Candidates, Integer>  {
    Candidates findCandidatesById(int id);
    Candidates findCandidatesByIdCapres(int idCapres);
    Candidates findCandidatesByIdCawapres(int idCawapres);
    Candidates findCandidatesByTahun(int tahun);
    Candidates findCandidatesByNoUrutAndTahun(int noUrut, int tahun);
}
