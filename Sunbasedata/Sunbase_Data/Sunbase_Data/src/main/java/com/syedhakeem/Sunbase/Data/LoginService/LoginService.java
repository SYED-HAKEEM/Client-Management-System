package com.syedhakeem.Sunbase.Data.LoginService;

import com.syedhakeem.Sunbase.Data.LoginDomain.Login;
import com.syedhakeem.Sunbase.Data.LoginRepository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    public Login login(String username, String password){
        Login login = loginRepository.findByUsernameAndPassword(username, password);
        return login;
    }
}
