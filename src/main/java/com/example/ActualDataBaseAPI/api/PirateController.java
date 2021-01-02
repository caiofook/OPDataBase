package com.example.ActualDataBaseAPI.api;

import com.example.ActualDataBaseAPI.model.Pirate;
import com.example.ActualDataBaseAPI.service.PirateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/pirate")
@RestController
public class PirateController {

    private final PirateService pirateService;

    @Autowired
    public PirateController(PirateService pirateService) {
        this.pirateService = pirateService;
    }

    @PostMapping
    public void addPirate(@RequestBody Pirate pirate) {
        pirateService.addPirate(pirate);
    }
}
