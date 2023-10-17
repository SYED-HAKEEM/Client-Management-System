package com.syedhakeem.Sunbase.Data.LoginRepository;

import com.syedhakeem.Sunbase.Data.LoginDomain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username, String password);
}
