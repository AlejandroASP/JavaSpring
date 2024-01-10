package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias;

import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.PersistenciaGuillermoH.ImplementsPersistence;
import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.PersistenciaGuillermoH.Persistence;
import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model.Farmacia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    static Persistence persistencia = new ImplementsPersistence();
    @GetMapping("/anadir")
    public String anadir(Model modelo){
        persistencia.openJson();
        modelo.addAttribute("Farmacia",new Farmacia());
        return "Añadir";
    }
    @PostMapping("/add")
    public String addPharmacy(Model modelo, Farmacia pharmacy){
        persistencia.checkJson();
        modelo.addAttribute("webFarmacia",pharmacy.getWEB());
        modelo.addAttribute("nombreFarmacia",pharmacy.getNOMBRE());
        modelo.addAttribute("telefono",pharmacy.getTELEFONO());
        modelo.addAttribute("horarioLunes",pharmacy.getLUNES());
        modelo.addAttribute("horarioMartes",pharmacy.getMARTES());
        modelo.addAttribute("horarioMiercoles",pharmacy.getMIERCOLES());
        modelo.addAttribute("horarioJueves",pharmacy.getJUEVES());
        modelo.addAttribute("horarioViernes",pharmacy.getVIERNES());
        modelo.addAttribute("horarioSabado",pharmacy.getSABADO());
        modelo.addAttribute("horarioDomingo",pharmacy.getDOMINGO());
        modelo.addAttribute("coordX",pharmacy.getUTM_X());
        modelo.addAttribute("coordY",pharmacy.getUTM_Y());
        persistencia.add(pharmacy);
        persistencia.closeJson();
        modelo.addAttribute("listadoFarmacias",persistencia.FarmaciaList());
        return "Listado";
    }
}
