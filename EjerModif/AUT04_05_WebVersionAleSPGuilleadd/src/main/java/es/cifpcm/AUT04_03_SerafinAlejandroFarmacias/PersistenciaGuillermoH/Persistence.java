package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.PersistenciaGuillermoH;

import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model.Farmacia;

import java.util.ArrayList;

public interface Persistence {
    void openJson();
    void checkJson();
    void closeJson();

    void add(Farmacia farmacia);

    ArrayList<Farmacia> FarmaciaList();
}
