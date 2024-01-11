package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String abrir(){
      return "Index";
    }

}
