package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.model.dto.UserDto;
import mx.com.santander.hexagonalmodularmaven.user.query.UserAuthenticationHandler;
import mx.com.santander.hexagonalmodularmaven.user.rest.controller.dto.UserLoginRequest;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserCommandController {

   private final UserAuthenticationHandler userAuthenticationHandler;

 @PostMapping
 public ResponseEntity<UserDto> login(@Valid @RequestBody UserLoginRequest request){
	 String token = userAuthenticationHandler
			 .execute(request.getUsername(), request.getPassword());
	 return ResponseEntity.ok(new UserDto(token));
 }
    

}
