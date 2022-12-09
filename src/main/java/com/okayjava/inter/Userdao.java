package com.okayjava.inter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.okayjava.html.model.User;

@Repository
public interface Userdao extends CrudRepository<User, Integer>{

}
