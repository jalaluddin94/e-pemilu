package com.government.ePemilu.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.government.ePemilu.models.Candidates;
import com.government.ePemilu.repositories.CandidatesRepository;

@Service
public class CandidatesService {
    @Autowired
    CandidatesRepository candidatesRepository;

    public List<Candidates> allCandidates(){
        List<Candidates> candidates = new ArrayList<Candidates>();
        candidatesRepository.findAll().forEach(candidate1 -> candidates.add(candidate1));
        return candidates;
    }

    public Candidates candidateById(int inputId){
        return candidatesRepository.findCandidatesById(inputId);
    }

    public Candidates candidateByTahun(int inputTahun){
        return candidatesRepository.findCandidatesByTahun(inputTahun);
    }

    public Candidates candidateByNoUrut(int inputNoUrut, int inputTahun){
        return candidatesRepository.findCandidatesByNoUrutAndTahun(inputNoUrut, inputTahun);
    }

    public void createOrUpdateCandidates(Candidates candidates){
        candidatesRepository.save(candidates);
    }
}
