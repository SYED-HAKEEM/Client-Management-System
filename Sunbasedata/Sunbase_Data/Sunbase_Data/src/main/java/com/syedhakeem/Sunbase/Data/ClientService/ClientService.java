package com.syedhakeem.Sunbase.Data.ClientService;

import com.syedhakeem.Sunbase.Data.ClientModule.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    public void saveClient(Client client);
    public Client getClientById(long id);
    public void deleteClient(long id);
}
