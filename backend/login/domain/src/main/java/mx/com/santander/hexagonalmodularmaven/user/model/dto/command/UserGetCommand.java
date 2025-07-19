	package mx.com.santander.hexagonalmodularmaven.user.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserGetCommand {

    private String username;
    private String password;

}
