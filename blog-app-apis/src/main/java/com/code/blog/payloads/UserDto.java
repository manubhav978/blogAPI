package com.code.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	@NotEmpty
	@Size(min = 3, message = "should be minimum 3 characters")
	private String name;
	@Email(message = "email address is not valid")
	private String email;
	@NotEmpty
	@Size(min = 3, max = 10, message = "must be min 3 and max 10")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{3,10}$", message = "Invalid password format")
	private String password;
	@NotEmpty
	private String about;
}
