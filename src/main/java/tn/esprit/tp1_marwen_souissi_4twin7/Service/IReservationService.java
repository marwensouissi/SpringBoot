package tn.esprit.tp1_marwen_souissi_4twin7.Service;

import tn.esprit.tp1_marwen_souissi_4twin7.enteties.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AjouterReservation(Reservation r);
    Reservation UpdateReservation(Reservation r);
    void SupprimerReservation(long idReservation);
    Reservation GetReservation(long idReservation);
    List<Reservation> GetAllReservation();
}
