package com.government.ePemilu.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.government.ePemilu.models.Voters;
import com.government.ePemilu.repositories.VotersRepository;

@Service
public class VotersService {
    @Autowired
    VotersRepository votersRepository;

    public List<Voters> allVoters(){
        List<Voters> voters = new ArrayList<Voters>();
        votersRepository.findAll().forEach(voters1 -> voters.add(voters1));
        return voters;
    }

    public Voters voterByNik(String inputNik){
        return votersRepository.findVotersByNik(inputNik);
    }
}
