package com.auckfmine.commercialcenter.controllers;

import com.auckfmine.commercialcenter.entities.Client;
import com.auckfmine.commercialcenter.services.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IServiceClient serviceClient;

    //http://localhost:8089/api/client/ajouterEtAffecterClientBoutiques/{idBoutiques}
    @PostMapping("/ajouterEtAffecterClientBoutiques/{idBoutiques}")
    @ResponseBody
    public void ajouterEtAffecterClientBoutiques(@RequestBody Client client , @PathVariable List<Long> idBoutiques){
        serviceClient.ajouterEtAffecterClientBoutiques(client,idBoutiques);
    }
}
