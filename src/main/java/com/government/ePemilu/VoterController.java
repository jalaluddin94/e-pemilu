package com.government.ePemilu;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.government.ePemilu.models.Voters;
import com.government.ePemilu.services.VotersService;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Voters")
public class VoterController {
    @Autowired
    VotersService votersService;

    @ApiOperation("View all voters")
    @GetMapping(path="/voters")
    public List<Voters> allVoters(){
        return votersService.allVoters();
    }

    @ApiOperation("View voter details by NIK")
    @GetMapping(path="/voters/{nik}")
    public Voters voterByNik(@PathVariable("nik") String nik){
        return votersService.voterByNik(nik);
    }

    @ApiOperation("Create new voter")
    @PostMapping("/voters")
    public Voters createVoter(@RequestBody Voters voters){
        votersService.createOrUpdateVoter(voters);
        return voters;
    }

    @ApiOperation("Update voter details")
    @PutMapping("/voters")
    public Voters updateVoter(@RequestBody Voters voters){
        votersService.createOrUpdateVoter(voters);
        return voters;
    }
}