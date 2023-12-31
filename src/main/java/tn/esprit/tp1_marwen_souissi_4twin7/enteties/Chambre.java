package tn.esprit.tp1_marwen_souissi_4twin7.enteties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Set;

@Entity
@Setter
@Getter
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idChambre;
    private long numchambre;

    private TypeChambre typeChambre;

    @ManyToOne
    private Bloc bloc2;

    @OneToMany
    private Set<Reservation> reservations;

}
