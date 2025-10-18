package com.axantial.equipay.repositories;

import com.axantial.equipay.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Account.class, idClass = Long.class)
public interface AccountRepository {
}
