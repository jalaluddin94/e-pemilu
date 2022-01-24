package com.government.ePemilu;

import java.util.List;

import com.government.ePemilu.models.Politicians;
import com.government.ePemilu.services.PoliticiansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.government.ePemilu.models.Candidates;
import com.government.ePemilu.services.CandidatesService;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Candidates")
public class CandidateController {
    @Autowired
    CandidatesService candidatesService;

    @ApiOperation("View all candidates")
    @GetMapping(path="/candidates")
    public List<Candidates> allCandidates(){
        return candidatesService.allCandidates();
    }

    @ApiOperation("View candidate details by Id")
    @GetMapping(path="/candidates/id/{id}")
    public Candidates candidatesById(@PathVariable("id") int id){
        return candidatesService.candidateById(id);
    }

    @ApiOperation("View candidate details by Year")
    @GetMapping(path="/candidates/year/{year}")
    public Candidates candidatesByYear(@PathVariable("year") int year){
        return candidatesService.candidateByTahun(year);
    }

    @ApiOperation("View candidate details by No Urut")
    @GetMapping(path="/candidates/year/{year}/no_urut/{no_urut}")
    public Candidates candidatesByYear(@PathVariable("year") int year, @PathVariable("no_urut") int no_urut){
        return candidatesService.candidateByNoUrut(no_urut, year);
    }

    @ApiOperation("Create new candidate")
    @PostMapping("/candidates")
    public Candidates createVoter(@RequestBody Candidates candidates){
        candidatesService.createOrUpdateCandidates(candidates);
        return candidates;
    }
}
