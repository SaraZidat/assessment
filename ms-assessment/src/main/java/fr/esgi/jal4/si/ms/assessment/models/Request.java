import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;


@Data
@Entity
@ToString
@JsonIgnoreProperties
public class Request {

    public String expression;
    private double result;

    @Id
    private LocalDateTime beginValidity;

    private LocalDateTime endValidity;

}