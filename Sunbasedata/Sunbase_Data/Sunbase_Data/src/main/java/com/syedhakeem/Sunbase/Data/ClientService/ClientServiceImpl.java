package com.syedhakeem.Sunbase.Data.ClientService;

import com.syedhakeem.Sunbase.Data.ClientModule.Client;
import com.syedhakeem.Sunbase.Data.ClientRepository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
    @Override
    public void saveClient(Client client){
        this.clientRepository.save(client);
    }
    @Override
    public Client getClientById(long id){
        Optional<Client> optional = clientRepository.findById(id);
        Client client = null;
        if(optional.isPresent()){
            client = optional.get();
        }else{
            throw new RuntimeException("Client not found");
        }
        return client;
    }
    @Override
    public void deleteClient(long id){
        this.clientRepository.deleteById(id);
    }
}
