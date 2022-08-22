package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import exception.UserAlreadyExistsException;
import exception.UserNotFoundException;
import model.User;
import repository.UserRepo;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public User registerUser(User newUser) throws UserAlreadyExistsException {
		try {
			userRepo.save(newUser);
			return newUser;
		}catch (Exception e) {
			throw new UserAlreadyExistsException();
		}
	}

	@Override
	public User updateUserDetails(User userToUpdate) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userLogin(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPersonNummer(String personNummer) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
