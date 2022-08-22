package service;

import java.util.List;

import exception.UserAlreadyExistsException;
import exception.UserNotFoundException;
import model.User;

public interface UserService {
	public User registerUser(User newUser) throws UserAlreadyExistsException;
	public User updateUserDetails(User userToUpdate) throws UserNotFoundException;
	public boolean userLogin(User user);
	public List<User> getAllUsers();
	public User getUserByPersonNummer(String personNummer) throws UserNotFoundException;
	public boolean deleteUser(int userId);
	
}
