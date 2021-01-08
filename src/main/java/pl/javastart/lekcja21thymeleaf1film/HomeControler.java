package pl.javastart.lekcja21thymeleaf1film;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    //szablon wskazujący na home.html

    @GetMapping("/") //wskazanie że ma obsługiwać stronę główną
    public String homePage() {
        return "Home"; //Home.html
    }
}
