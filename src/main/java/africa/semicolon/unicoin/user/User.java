package africa.semicolon.unicoin.user;

import jakarta.mail.Message;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Entity
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message="This field is required")
    @NotEmpty(message= "This Field is required")
    @Email(message="This field required a valid email address")
    private String emailAddress;
    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String firstName;
    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String lastName;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private Boolean isDisabled = true;

    public User(String emailAddress, String firstName, String lastName, String password, UserRole userRole) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userRole = userRole;
    }
}
