package tn.esprit.tp1_marwen_souissi_4twin7.Service;

import tn.esprit.tp1_marwen_souissi_4twin7.enteties.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre AjoutChambre(Chambre c);
    Chambre UpdateChambre(Chambre c);
    void SupprimerChambre(long idChambre);
    Chambre GetChambre(long idChambre);
    List<Chambre> GetAllChambres();
}
