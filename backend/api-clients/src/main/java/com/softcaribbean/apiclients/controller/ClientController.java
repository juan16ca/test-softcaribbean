package com.softcaribbean.apiclients.controller;

import com.softcaribbean.apiclients.models.common.ResponseService;
import com.softcaribbean.apiclients.models.entity.Client;
import com.softcaribbean.apiclients.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private IClientService iClientService;

    @PostMapping("/create")
    public ResponseEntity<ResponseService> addClient(@RequestBody Client client) {
        return ResponseEntity.ok(iClientService.createUser(client));
    }

    @GetMapping("/getClient/{identificationNumber}")
    public ResponseEntity<ResponseService> getByIdentificationNumber(
            @PathVariable("identificationNumber") int identificationNumber) {
        return ResponseEntity.ok(iClientService.getInfoClientFromTree(identificationNumber));
    }

    @GetMapping("/getAllClient")
    public ResponseEntity<ResponseService> getAllInformation() {
        return ResponseEntity.ok(iClientService.getAllInfoFromTree());
    }

}
