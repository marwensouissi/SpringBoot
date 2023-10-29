package tn.esprit.tp1_marwen_souissi_4twin7.Service;

import tn.esprit.tp1_marwen_souissi_4twin7.enteties.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc AjouterBloc(Bloc b);
    Bloc UpdateBloc(Bloc b);
    void SupprimerBloc(long idBloc );
    Bloc GetBloc(long idBloc);
    List<Bloc> GetAllBlocs();



}
