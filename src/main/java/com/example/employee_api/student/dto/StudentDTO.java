package com.example.employee_api.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.Valid;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {
    @NotBlank(message = "Student code cannot be blank")
    @Pattern(regexp = "^SV\\d{4}$", message = "Student code must follow format SVxxxx (Example: SV0001)")
    private String studentCode;


    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 5, max = 100, message = "Full name must be between 5 and 100 characters")
    private String fullName;

    @NotBlank(message = "Major cannot be blank")
    private String major;
    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    @Min(value = 0, message = "GPA must be at least 0")
    @Max(value = 10, message = "GPA must be at most 10")
    private Double gpa;
    @Valid
    private ParentDTO parent;

}
