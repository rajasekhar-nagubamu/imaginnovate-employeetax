package com.imaginnovate.employeetax.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor

public class PhoneNumber {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id", nullable = false)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "emp_id")
	    private Employee phoneNumbers;

	    @NonNull
	    private Long phoneNumber;
}
