package Base.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
@Entity
@Table(name="User_details")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Email(message = "Invalid email format")  
	@NotBlank(message = "Email is required")
	private String email;

	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid mobile number format")
	private String mobileNo;

	@NotBlank(message = "Pin code is required")
	@Pattern(regexp = "^[0-9]{6}$", message = "Invalid pin code format")
	private String pinCode;
	
	@NotBlank(message = "PAN card number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid PAN card number format")
	private String panCard;
	
	@NotBlank(message = "Aadhaar card number is required")
	@Pattern(regexp = "^[0-9]{12}$", message = "Invalid Aadhaar card number format")
	private String aadhaarCard;
	
	@NotBlank(message = "Confirm password is required")
	private String confirmPassword;
	
	@NotBlank(message = "Full name is required")
	private String fullName;

	@NotBlank(message = "Country is required")
	 private String country;
	
	@NotBlank(message = "State is required")
	private String state;
	
	@NotBlank(message = "City is required")
	private String city;
	
	@NotBlank(message = "District is required")
	private String district;
    
	@NotBlank(message = "User Type is required")
	private String userType;
	
	@NotBlank(message = "Password is required")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
	private String password;


	


}
