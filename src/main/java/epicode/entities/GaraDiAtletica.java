package epicode.entities;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Entity
public class GaraDiAtletica extends Event {
    //Attributi
    private List<Person> atleti;
    private Person vincitore;

    //Costruttori

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, List<Person> atleti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    //Metodi

    public List<Person> getAtleti() {
        return atleti;
    }

    public void setAtleti(List<Person> atleti) {
        this.atleti = atleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
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
