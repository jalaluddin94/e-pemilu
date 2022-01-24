package com.government.ePemilu;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.government.ePemilu.models.Politicians;
import com.government.ePemilu.services.PoliticiansService;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Politicians")
public class PoliticianController {
    @Autowired
    PoliticiansService politiciansService;

    @ApiOperation("View all voters")
    @GetMapping(path="/politicians")
    public List<Politicians> allVoters(){
        return politiciansService.allPoliticians();
    }

    @ApiOperation("View voter details by NIK")
    @GetMapping(path="/politicians/{nik}")
    public Politicians politiciansByNik(@PathVariable("nik") String nik){
        return politiciansService.politicianByNik(nik);
    }

    @ApiOperation("Create new voter")
    @PostMapping("/politicians")
    public Politicians createVoter(@RequestBody Politicians politicians){
        politiciansService.createOrUpdatePoliticians(politicians);
        return politicians;
    }

    @ApiOperation("Update voter details")
    @PutMapping("/politicians")
    public Politicians updateVoter(@RequestBody Politicians politicians){
        politiciansService.createOrUpdatePoliticians(politicians);
        return politicians;
    }
}