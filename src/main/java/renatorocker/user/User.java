package renatorocker.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@Entity
@Validated
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	@NotBlank(message = "Login is mandatory")
	@Email
	private String login;
	@NotNull
	@NotBlank(message = "Senha obrigatoria")
	@Size(min=6, max=60)
	private String password;
	private Date createdAt;
	
	public User() {
		
	}
	
	public User(String login, String password, Date createdAt) {
		this.login = login;
		this.password = password;
		this.createdAt = createdAt;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public Date createdAt() {
		return createdAt;
	}
}
