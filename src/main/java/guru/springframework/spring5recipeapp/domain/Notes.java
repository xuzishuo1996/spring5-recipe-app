package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob    //CLOB field inside db
    private String recipeNotes;

}
