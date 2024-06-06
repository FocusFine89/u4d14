package epicode.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import java.time.LocalDate;

@Entity

@NamedQuery(name = "getPartiteVinteInCasa", query = "SELECT p FROM PartitaDiCalcio p WHERE p.squadraDiCasa=p.vincente")
@NamedQuery(name = "getPartiteVinteInTrasferta", query = "SELECT p FROM PartitaDiCalcio p WHERE p.ospite=p.vincente")
public class PartitaDiCalcio extends Event {
    //Attributi
    private String squadraDiCasa;
    private String ospite;
    private String vincente;
    private int numeroGoal;
    private int numeroGoalOspite;

    //Costruttori
    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String ospite, String vincente, int numeroGoal, int numeroGoalOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.ospite = ospite;
        this.vincente = vincente;
        this.numeroGoal = numeroGoal;
        this.numeroGoalOspite = numeroGoalOspite;
    }

    //Metodi

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getOspite() {
        return ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    public String getVincente() {
        return vincente;
    }

    public void setVincente(String vincente) {
        this.vincente = vincente;
    }

    public int getNumeroGoal() {
        return numeroGoal;
    }

    public void setNumeroGoal(int numeroGoal) {
        this.numeroGoal = numeroGoal;
    }

    public int getNumeroGoalOspite() {
        return numeroGoalOspite;
    }

    public void setNumeroGoalOspite(int numeroGoalOspite) {
        this.numeroGoalOspite = numeroGoalOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", vincente='" + vincente + '\'' +
                ", numeroGoal=" + numeroGoal +
                ", numeroGoalOspite=" + numeroGoalOspite +
                '}';
    }
}
