package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class Notes {
//    @Id
    private String id = UUID.randomUUID().toString();
    private Recipe recipe;
    private String recipeNotes;

}
