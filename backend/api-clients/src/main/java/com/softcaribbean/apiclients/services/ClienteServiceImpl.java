package com.softcaribbean.apiclients.services;

import java.util.List;

import com.softcaribbean.apiclients.models.common.ResponseError;
import com.softcaribbean.apiclients.models.common.ResponseService;
import com.softcaribbean.apiclients.models.common.enums.EResponseType;
import com.softcaribbean.apiclients.models.entity.Client;
import com.softcaribbean.apiclients.models.entity.Node;
import com.softcaribbean.apiclients.models.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clienteRepository;

    @Autowired
    private ResponseService responseService;

    @Autowired
    private ResponseError responseError;

    private Node node;

    private Client client;

    @Override
    public ResponseService createUser(Client client) {

       if (node == null) {
            node = new Node(client);
        } else {
            node.add(client);
        }

        responseService.setResponse(clienteRepository.save(client));
        responseService.setTipoRespuesta(EResponseType.OK.toString());
        responseService.setResponseError(null);
        return responseService;
    }

    @Override
    public ResponseService getInfoClientFromDatabase() {

        List<Client> listClient = (List<Client>) clienteRepository.findAll();

        if (!listClient.isEmpty()) {
            responseService.setTipoRespuesta(EResponseType.OK.toString());
            responseService.setResponse(listClient);

        } else {
            responseService.setTipoRespuesta(EResponseType.ER.toString());
        }

        return responseService;

    }

    @Override
    public ResponseService getInfoClientFromTree(int identificationNumber) {

        if (node != null) {

            client = node.find(node, identificationNumber);

            if (client != null) {
                responseService.setTipoRespuesta(EResponseType.OK.toString());
                responseService.setResponse(client);
            } else {
                responseService.setTipoRespuesta(EResponseType.ER.toString());
                responseError.setDetailError("No found information in tree");
                responseService.setResponse(null);
                responseService.setResponseError(responseError);
            }

        } else {
            responseService.setTipoRespuesta(EResponseType.ER.toString());
            responseError.setDetailError("No found information by id in tree");
            responseService.setResponseError(responseError);
        }

        return responseService;
    }

    @Override
    public ResponseService getAllInfoFromTree() {
        if (node != null) {
            responseService.setTipoRespuesta(EResponseType.OK.toString());
            responseService.setResponse(node);
        } else {
            responseService.setTipoRespuesta(EResponseType.ER.toString());
            responseError.setDetailError("No found information in tree");
            responseService.setResponseError(responseError);
        }

        return responseService;
    }

}
