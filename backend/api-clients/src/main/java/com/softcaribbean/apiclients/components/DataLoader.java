package com.softcaribbean.apiclients.components;

import java.util.List;

import com.softcaribbean.apiclients.models.common.ResponseService;
import com.softcaribbean.apiclients.models.common.enums.EResponseType;
import com.softcaribbean.apiclients.models.entity.Client;
import com.softcaribbean.apiclients.services.IClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private IClientService iClientService;

    @Autowired
    private ResponseService responseService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        responseService = iClientService.getInfoClientFromDatabase();
        if (responseService.getTipoRespuesta().equals(EResponseType.OK.toString())) {
            
            List<Client> listClient = (List<Client>) responseService.getResponse();
            listClient.stream().forEach((client) -> iClientService.createUser(client));

        }

    }

}
