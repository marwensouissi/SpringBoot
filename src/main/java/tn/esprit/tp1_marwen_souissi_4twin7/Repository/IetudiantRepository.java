package tn.esprit.tp1_marwen_souissi_4twin7.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp1_marwen_souissi_4twin7.enteties.Etudiant;

public interface IetudiantRepository extends JpaRepository<Etudiant,Long> {
}
