package com.syedhakeem.Sunbase.Data.ClientController;

import com.syedhakeem.Sunbase.Data.ClientModule.Client;
import com.syedhakeem.Sunbase.Data.ClientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/showClients")
    public String viewClientList(Model model){
        model.addAttribute("listClients", clientService.getAllClients());
        return "clientList";
    }
    @GetMapping("/showNewClientForm")
    public String showNewClientForm(Model model){
        Client client = new Client();
        model.addAttribute("client", client);
        return "newClient";
    }
    @PostMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client){
        if(client.getFirtsName() != "" && client.getLastName() != ""){
            clientService.saveClient(client);
        }
        return "redirect:/showClients";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model){
        Client client = clientService.getClientById(id);
        model.addAttribute("client", client);
        return "updateClient";
    }
    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable (value = "id") long id){
        this.clientService.deleteClient(id);
        return "redirect:/showClients";
    }
}
