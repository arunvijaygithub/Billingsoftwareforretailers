package in.arunpandiyan.billingsoftware.service;

import in.arunpandiyan.billingsoftware.io.UserRequest;
import in.arunpandiyan.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
