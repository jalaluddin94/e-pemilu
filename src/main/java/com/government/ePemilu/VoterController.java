package com.government.ePemilu;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.government.ePemilu.models.Voters;
import com.government.ePemilu.services.VotersService;

@Configuration
//Controller
@RestController
public class VoterController {
    @Autowired
    VotersService votersService;

    @GetMapping(path="/voters")
    public List<Voters> allVoters(){
        return votersService.allVoters();
    }

    @GetMapping(path="/voters/{nik}")
    public String nikVoter(@PathVariable String nik){
        return String.format("NIK = %s", nik);
    }
}