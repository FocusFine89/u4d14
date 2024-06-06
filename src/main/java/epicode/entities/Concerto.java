package epicode.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Concerto extends Event {
    //Attributi
    private ConcertType genere;
    private boolean inStreaming;

    //Costruttori

    public Concerto() {
    }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, ConcertType genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    //Metodi


    public ConcertType getGenere() {
        return genere;
    }

    public void setGenere(ConcertType genere) {
        this.genere = genere;
    }

    public boolean getInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
