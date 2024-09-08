package com.jpob.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpob.workshopmongo.domain.User;
import com.jpob.workshopmongo.dto.UserDTO;
import com.jpob.workshopmongo.repository.UserRepository;
import com.jpob.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
	    Optional<User> user = repo.findById(id);
	    
	    return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}
}
