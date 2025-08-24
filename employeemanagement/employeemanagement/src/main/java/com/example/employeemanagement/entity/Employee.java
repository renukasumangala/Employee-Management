package com.example.employeemanagement.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be 2–50 characters")
    private String name;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Department is required")
    @Size(max = 30, message = "Department must be <= 30 characters")
    private String department;

    @NotNull(message = "Salary is required")
    @DecimalMin(value = "1.0", message = "Salary must be greater than 0")
    private Double salary;

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public Double getSalary() { return salary; }



    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(Double salary) { this.salary = salary; }
}
