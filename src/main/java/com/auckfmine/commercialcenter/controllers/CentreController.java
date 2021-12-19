package com.auckfmine.commercialcenter.controllers;

import com.auckfmine.commercialcenter.entities.CentreCommercial;
import com.auckfmine.commercialcenter.services.IServiceCentreCommercial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/centre")
public class CentreController {
    @Autowired
    IServiceCentreCommercial serviceCentreCommercial;


    //http://localhost:8089/api/centre/ajouterCentre
    @PostMapping("/ajouterCentre")
    @ResponseBody

    public void ajouterCentre(@RequestBody CentreCommercial centreCommercial){
        serviceCentreCommercial.ajouterCentreCommercial(centreCommercial);
    }

}
