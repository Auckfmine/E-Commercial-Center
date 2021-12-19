package com.auckfmine.commercialcenter.controllers;


import com.auckfmine.commercialcenter.entities.Boutique;
import com.auckfmine.commercialcenter.services.IServiceBoutique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boutique")
public class BoutiqueController {
    @Autowired
    IServiceBoutique serviceBoutique;

    //http://localhost:8089/api/boutique/ajouterListeBoutiques/{idCentre}
    @PostMapping("/ajouterListeBoutiques/{idCentre}")
    @ResponseBody
    public void ajouterEtAffecterlisteBoutiques(@RequestBody List<Boutique>boutiques ,@PathVariable("idCentre")Long idCentre){

        serviceBoutique.ajouterEtAffecterListeBoutiques(boutiques,idCentre);
    }
}
