package com.government.ePemilu;

import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Configuration;

@Configuration
//Controller
@RestController
public class VoterController {
    @GetMapping(path="/voter/{nik}")
    public String nikVoter(@PathVariable String nik){
        return String.format("NIK = %s", nik);
    }
}
