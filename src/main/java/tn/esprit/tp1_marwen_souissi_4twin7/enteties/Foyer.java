package tn.esprit.tp1_marwen_souissi_4twin7.enteties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
@Setter
@Getter
@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long idFoyer;


    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

}
