package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias;

import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.data.ImplementsPersistence;
import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.data.Persistence;
import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model.Farmacia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller

public class ListaFarmaciasController {
    static Persistence persistencia = new ImplementsPersistence();
    @GetMapping("/abrir")
    public String abrir(Model modelo){
        persistencia.openJson();
        modelo.addAttribute("listadoFarmacias",persistencia.listaFarmacias());
        return "Listado";
    }
    @PostMapping("/find")
    public String find(Model modelo, @RequestParam("search") String name){
        float utmX = 0.0f;
        float utmY = 0.0f;
        float rangeX = 1600.0f;
        float rangeY = 16000.0f;

        ArrayList<Farmacia> listadoFarmacias = persistencia.listaFarmacias();
        ArrayList<Farmacia> farmaciasCercanas = new ArrayList<>();

        for(Farmacia farmacia : listadoFarmacias){
            if(farmacia.getNOMBRE().toLowerCase().equals(name.toLowerCase())){
                utmX = farmacia.getUTM_X();
                utmY = farmacia.getUTM_Y();
                break;
            }
        }

        for(Farmacia farmacia : listadoFarmacias){
            float distanceX = Math.abs(farmacia.getUTM_X() - utmX);
            float distanceY = Math.abs(farmacia.getUTM_Y() - utmY);
            if(distanceX <= rangeX && distanceY <= rangeY){
                farmaciasCercanas.add(farmacia);
            }
        }
        modelo.addAttribute("farmaciasCercanas", farmaciasCercanas);
        modelo.addAttribute("listadoFarmacias", persistencia.listaFarmacias());
        return "Listado";
    }

}
