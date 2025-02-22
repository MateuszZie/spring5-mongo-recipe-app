package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {

    private String id = UUID.randomUUID().toString() ;
    private String description;
}
