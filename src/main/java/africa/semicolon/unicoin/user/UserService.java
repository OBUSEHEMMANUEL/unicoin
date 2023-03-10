package africa.semicolon.unicoin.user;

import africa.semicolon.unicoin.registration.token.ConfirmTokenRequest;

public interface UserService {
    String createAccount(User user);

    void enableUser(String emailAddress);
    String login(LoginRequest loginRequest);

    String changePassword(ChangePasswordRequest changePasswordRequest);

    String deleteUser(DeleteUserRequest deleteUserRequest);

}
