package com.juan.backend.userapp.backenduserapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juan.backend.userapp.backenduserapp.models.dto.UserDto;
import com.juan.backend.userapp.backenduserapp.models.dto.mapper.DtoMapperUser;
import com.juan.backend.userapp.backenduserapp.models.entities.Role;
import com.juan.backend.userapp.backenduserapp.models.entities.User;
import com.juan.backend.userapp.backenduserapp.models.request.UserRequest;
import com.juan.backend.userapp.backenduserapp.repositories.RoleRepository;
import com.juan.backend.userapp.backenduserapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@Transactional(readOnly = true)
	public List<UserDto> findAll() {

		List<User> users = (List<User>) userRepository.findAll();

		return users.stream().map(user -> DtoMapperUser.builder().setUser(user).build()).toList();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<UserDto> findById(Long id) {
		return userRepository.findById(id).map(u -> DtoMapperUser.builder()
				.setUser(u)
				.build());
	}

	@Override
	@Transactional
	public UserDto save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		Optional<Role> o = roleRepository.findByName("ROLE_USER");

		List<Role> roles = new ArrayList<>();

		if (o.isPresent()) {
			roles.add(o.orElseThrow());
		}

		user.setRoles(roles);

		return DtoMapperUser.builder().setUser(userRepository.save(user)).build();
	}

	@Override
	@Transactional
	public void remove(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Optional<UserDto> update(UserRequest user, Long id) {
		Optional<User> o = userRepository.findById(id);
		User userOptional = null;

		if (o.isPresent()) {
			User userDb = o.orElseThrow();
			userDb.setUsername(user.getUsername());
			userDb.setEmail(user.getEmail());

			userOptional = userRepository.save(userDb);
		}

		return Optional.ofNullable(DtoMapperUser.builder().setUser(userOptional).build());
	}

}
