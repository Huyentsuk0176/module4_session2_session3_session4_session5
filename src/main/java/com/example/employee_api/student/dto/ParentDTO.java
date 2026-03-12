package com.example.employee_api.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ParentDTO {

    @NotBlank(message = "Parent name cannot be blank")
    @Pattern(regexp = "^[A-Z].*", message = "Parent name must start with a capital letter")
    private String name;

    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String phone;

}