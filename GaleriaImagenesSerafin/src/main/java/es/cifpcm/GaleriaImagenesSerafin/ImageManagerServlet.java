package es.cifpcm.GaleriaImagenesSerafin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ImageManagerServlet {

    private static String UPLOAD_FOLDER = "F:\\DSW\\Java\\GaleriaImagenesSerafin\\src\\main\\resources\\uploadsSerafin\\";

    @PostMapping("/imageManager")
    public String upload(@RequestParam("imageFile") MultipartFile file, RedirectAttributes redirectAttributes) {
        try {
            File directory = new File(UPLOAD_FOLDER);
            byte[] bytes = file.getBytes();
            if (! directory.exists()){
                directory.mkdir();
            }
            Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message", "Archivo subido correctamente");
            return "redirect:/index";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Error al subir el archivo: " + e.getMessage());
            return "redirect:/index";
        }
    }
    @GetMapping("/imageManager")
    public @ResponseBody List<String> listImages() {
        File folder = new File(UPLOAD_FOLDER);
        File[] listOfFiles = folder.listFiles();
        List<String> imageLinks = new ArrayList<>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                imageLinks.add("/uploadsSerafin/" + file.getName());
            }
        }
        return imageLinks;
    }
    @GetMapping("/index")
    public String index(Model model) {
        File folder = new File(UPLOAD_FOLDER);
        File[] listOfFiles = folder.listFiles();

        List<String> imageLinks = new ArrayList<>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                imageLinks.add("/uploadsSerafin/" + file.getName());
            }
        }
        model.addAttribute("imageLinks", imageLinks);
        return "index";
    }
}
