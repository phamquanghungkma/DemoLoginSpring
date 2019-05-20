package com.basic.login.Repository;

import com.basic.login.Domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Integer> {

    Role findByName(String name);


}
