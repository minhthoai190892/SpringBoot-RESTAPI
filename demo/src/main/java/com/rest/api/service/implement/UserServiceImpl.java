package com.rest.api.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.entity.User;
import com.rest.api.repository.UserRepository;
import com.rest.api.service.UserService;

import lombok.RequiredArgsConstructor;
@Service

public class UserServiceImpl implements UserService {
	private   UserRepository repository;
	
@Autowired
	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}





	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
