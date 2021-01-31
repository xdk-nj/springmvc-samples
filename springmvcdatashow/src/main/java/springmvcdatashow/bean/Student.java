package springmvcdatashow.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springmvcdatashow.validation.ValidationG1;
import springmvcdatashow.validation.ValidationG2;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @NotNull(groups = ValidationG2.class)
    private Integer id;

    @NotNull(groups = {ValidationG2.class, ValidationG1.class})
    @Size(max = 10, min = 2, groups = {ValidationG2.class, ValidationG1.class})
    private String name;

    @Email(groups = {ValidationG2.class, ValidationG1.class})
    private String email;

    @Max(value = 100,groups = {ValidationG2.class, ValidationG1.class})
    private Integer age;
}
