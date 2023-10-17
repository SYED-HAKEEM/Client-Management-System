package com.syedhakeem.Sunbase.Data.ClientRepository;

import com.syedhakeem.Sunbase.Data.ClientModule.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
