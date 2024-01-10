package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.data;

import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model.Farmacia;

import java.util.ArrayList;

public interface Persistence {
    void openJson();
    ArrayList<Farmacia> listaFarmacias();
}
