package epicode.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class GaraDiAtletica extends Event {
    //Attributi
    private String atleti;
    private String vincitore;

    //Costruttori

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String atleti, String vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    //Metodi

    public String getAtleti() {
        return atleti;
    }

    public void setAtleti(String atleti) {
        this.atleti = atleti;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
