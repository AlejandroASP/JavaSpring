package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.data;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model.Farmacia;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ImplementsPersistence implements Persistence {
    private Gson gson = new Gson();
    private FileReader reader;
    private ArrayList<Farmacia> memStore;
    private Path tempDirectory;
    private String jsonFileName = "SerafinAlejandro.json";

    public ImplementsPersistence() {
        try {
            // Definir un nombre específico para el directorio
            String dirName = "SerafinAlejandro_Farmacias";
            // Crear un Path con el nombre del directorio
            tempDirectory = Paths.get(dirName);
            // Comprobar si el directorio existe, si no, lo crea
            if (!Files.exists(tempDirectory)) {
                Files.createDirectory(tempDirectory);
            }
            // Inicializa memStore como un nuevo ArrayList<Farmacia>
            memStore = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void openJson() {
        ArrayList <Farmacia> farmacias = new ArrayList<>();
        farmacias.add(new Farmacia("www.farmaciaLuño.com","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","09:15,13:00, ,",", , ,","922597722","FARMACIA LUÑO",378901.39636f,3151710.14449f));
        farmacias.add(new Farmacia("www.loscampitos.com","09:00,14:00,17:00,20:30","09:00,14:00,17:00,20:30","09:00,14:00,17:00,20:30","09:00,14:00,17:00,20:30","09:00,14:00,17:00,20:30","09:15,14:00, ,",", , ,","922281323","FARMACIA LOS CAMPITOS",376481.901533f,3151614.6634f));
        farmacias.add(new Farmacia("www.pharmacyTriviño.com","08:30, , ,21:30","08:30, , ,21:30","08:30, , ,21:30","08:30, , ,21:30","08:30, , ,21:30","09:00,13:30, ,",", , ,","922537179","FARMACIA TRIVIÑO",370786.589416f,3146161.33643f));
        farmacias.add(new Farmacia("","09:00, , ,21:00","09:00, , ,21:00","09:00, , ,21:00","09:00, , ,21:00","09:00, , ,21:00","09:00,13:30, ,",", , ,","922629609","FARMACIA BUENO-FELIPE",370645.7078f,3145768.15526f));
        farmacias.add(new Farmacia("","08:30,14:00,16:15,21:00","08:30,14:00,16:15,21:00","08:30,14:00,16:15,21:00","08:30,14:00,16:15,21:00","08:30,14:00,16:15,21:00","08:30,14:00, ,","08:30,14:00, ,","922213070","FARMACIA GONZALEZ ARQUEROS",377328.383805f,3149220.56944f));
        farmacias.add(new Farmacia("","09:00,15:00,16:00,21:00","09:00,15:00,16:00,21:00","09:00,15:00,16:00,21:00","09:00,15:00,16:00,21:00","09:00,15:00,16:00,21:00","09:15,13:30, ,",", , ,","922221434","FARMACIA MONJE",376814.751654f,3149083.43488f));
        farmacias.add(new Farmacia("http://www.farmaciaferia.org","08:15, , ,20:15","08:15, , ,20:15","08:15, , ,20:15","08:15, , ,20:15","08:15, , ,20:15","09:30,13:00, ,",", , ,","922229206","FARMACIA FERIA",376311.531285f,3148666.25951f));
        farmacias.add(new Farmacia("","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:15,13:00, ,",", , ,","922226412","FARMACIA DURANA",376510.764009f,3148989.27321f));
        farmacias.add(new Farmacia("","08:30, , ,22:00","08:30, , ,22:00","08:30, , ,22:00","08:30, , ,22:00","08:30, , ,22:00","08:30, , ,22:00","08:30, , ,22:00","922220379","FARMACIA LA SALLE",376909.315286f,3148841.95302f));
        farmacias.add(new Farmacia("","08:00, , ,21:00","08:00, , ,21:00","08:00, , ,21:00","08:00, , ,21:00","08:00, , ,21:00","09:00,15:30, ,",", , ,","922222125","FARMACIA GONZALEZ",376439.246709f,3148627.61447f));
        farmacias.add(new Farmacia("","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:15,13:00, ,",", , ,","922270417","FARMACIA GONZALEZ ARROYO",376594.505589f,3149655.97708f));
        farmacias.add(new Farmacia("http://www.farmaciaelchinito.com/","09:00,13:30,16:45,20:15","09:00,13:30,16:45,20:15","09:00,13:30,16:45,20:15","09:00,13:30,16:45,20:15","09:00,13:30,16:45,20:15","09:15,13:15, ,",", , ,","922275719","FARMACIA EL CHINITO",376826.406998f,3149630.423f));
        farmacias.add(new Farmacia("http://www.farmaciaduggi.com/","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:00,14:00, ,",", , ,","922289806","FARMACIA DUGGI",376713.183678f,3149492.92425f));
        farmacias.add(new Farmacia("","09:00,13:00,16:30,20:00","09:00,13:00,16:30,20:00","09:00,13:00,16:30,20:00","09:00,13:00,16:30,20:00","09:00,13:00,16:30,20:00","09:00,13:30, ,",", , ,","922614101","FARMACIA BENCOMO DUQUE",369430.316439f,3144840.08494f));
        farmacias.add(new Farmacia("","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:00, , ,20:30","09:30,13:30, ,",", , ,","922612915","FARMACIA LAS MORADITAS",373607.806499f,3147304.15303f));
        farmacias.add(new Farmacia("http://www.farmaciamanuelgonzalezetayo.com","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","09:00,14:00, ,",", , ,","922272405","FARMACIA GONZALEZ ETAYO",377444.548662f,3150165.06131f));
        farmacias.add(new Farmacia("","09:00, , ,19:30","09:00, , ,19:30","09:00, , ,19:30","09:00, , ,19:30","09:00, , ,19:30","09:15,13:00, ,",", , ,","922284444","FARMACIA MENCEY",377324.10351f,3150308.69772f));
        farmacias.add(new Farmacia("","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:00, ,",", , ,","922275814","FARMACIA PELAEZ PARAMO",377564.452822f,3150345.15472f));
        farmacias.add(new Farmacia("","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:30,16:30,20:00","09:00,13:00, ,",", , ,","922283459","FARMACIA CB SUAREZ",377671.28543f,3150052.98844f));
        farmacias.add(new Farmacia("","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:15,13:00, ,",", , ,","922275347","FARMACIA SANZ DOBLADO",377776.858071f,3150220.94332f));
        farmacias.add(new Farmacia("","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","08:30, , ,20:00","09:00,14:00, ,","09:00,14:00, ,","922275 63","FARMACIA ANAGA",378290.658903f,3150873.46912f));
        farmacias.add(new Farmacia("","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:00, ,",", , ,","922270379","FARMACIA FERNANDEZ",377685.934678f,3150540.03388f));
        farmacias.add(new Farmacia("","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","09:00, , ,20:00",", , ,","922596756","FARMACIA MARÍA JIMENEZ",379968.423377f,3152555.3364f));
        farmacias.add(new Farmacia("","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:00,13:30,16:45,19:30","09:15,13:00, ,",", , ,","922596634","FARMACIA GONZALEZ LUIS",378129.045183f,3151414.70721f));
        farmacias.add(new Farmacia("","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","08:30, , ,20:30","09:00, , ,20:00","09:00,13:00, ,","922591117","FARMACIA DE LUGO FERNANDEZ",383279.185084f,3153725.28429f));
        farmacias.add(new Farmacia("","09:00,13:30,16:45,20:00","09:00,13:30,16:45,20:00","09:00,13:30,16:45,20:00","09:00,13:30,16:45,20:00","09:00,13:30,16:45,20:00","09:00,13:00, ,",", , ,","922272573","FARMACIA MESTRES IZQUIERDO",375788.812772f,3150118.09615f));
        try {
            // Definir la ruta completa al archivo JSON
            Path jsonFilePath = tempDirectory.resolve(jsonFileName);
            // Comprobar si el archivo existe, si no, lo crea
            if (!Files.exists(jsonFilePath)) {
                Files.createFile(jsonFilePath);
                FileWriter writer = new FileWriter(tempDirectory.resolve(jsonFileName).toFile());
                gson.toJson(farmacias, writer);
                writer.close();
            }
            // Abre el archivo JSON para lectura
            reader = new FileReader(jsonFilePath.toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<Farmacia> listaFarmacias() {
        openJson();
        // Lee el archivo JSON existente y lo convierte en una lista de objetos Farmacia
        Type type = new TypeToken<ArrayList<Farmacia>>() {}.getType();
        memStore = gson.fromJson(reader, type);

        // Si memStore es null, inicialízalo como un nuevo ArrayList
        if (memStore == null) {
            memStore = new ArrayList<>();
        }
        return memStore;
    }
}
