package mes.practical.UnitTestingExample.DTO;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonSerializableSchema
@ToString
public class Student {
    String name;
    String rollno;
    String classy;
    String div;
    String phone;
    String email;
}
