package com.imaginnovate.employeetax.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer employeeID;

	@NotBlank(message = "First name is mandatory")
    private String firstName;

	@NotBlank(message = "Last name is mandatory")
    private String lastName;

	@Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

	@ElementCollection
    @NotEmpty(message = "At least one phone number is required")
    @OneToMany(cascade = CascadeType.ALL)
	private List<PhoneNumber> phoneNumbers;

	@NotNull(message = "Date of joining is mandatory")
    private String dateOfJoin;

	@NotNull(message = "Salary is mandatory")
    @Min(value = 0, message = "Salary must be greater than or equal to 0")
    private Integer salary;
}
