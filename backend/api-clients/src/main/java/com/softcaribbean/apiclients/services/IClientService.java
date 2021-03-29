package com.softcaribbean.apiclients.services;

import com.softcaribbean.apiclients.models.common.ResponseService;
import com.softcaribbean.apiclients.models.entity.Client;

public interface IClientService {

    public ResponseService createUser(Client client);
    public ResponseService getInfoClientFromDatabase();
    public ResponseService getInfoClientFromTree(int identificationNumber);
    public ResponseService getAllInfoFromTree();
    
}
