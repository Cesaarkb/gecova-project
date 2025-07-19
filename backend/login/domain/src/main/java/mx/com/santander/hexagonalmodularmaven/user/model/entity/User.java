package mx.com.santander.hexagonalmodularmaven.user.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;

}
