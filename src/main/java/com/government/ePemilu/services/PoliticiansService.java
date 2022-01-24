package com.government.ePemilu.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.government.ePemilu.models.Politicians;
import com.government.ePemilu.repositories.PoliticiansRepository;

@Service
public class PoliticiansService {
    @Autowired
    PoliticiansRepository politiciansRepository;

    public List<Politicians> allPoliticians(){
        List<Politicians> politicians = new ArrayList<Politicians>();
        politiciansRepository.findAll().forEach(voters1 -> politicians.add(voters1));
        return politicians;
    }

    public Politicians politicianByNik(String inputNik){
        return politiciansRepository.findPoliticiansByNik(inputNik);
    }

    public void createOrUpdatePoliticians(Politicians politician){
        politiciansRepository.save(politician);
    }

    public void updatePolitician(Politicians politicians, int idPolitician){
        politiciansRepository.save(politicians);
    }
}
