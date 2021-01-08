package pl.javastart.lekcja21thymeleaf1film;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HomeControler {

    //szablon wskazujący na home.html

    @GetMapping("/") //wskazanie że ma obsługiwać stronę główną
    public String homePage(Model model) { // model to kontener na dane
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Test 2");
        list.add("Test 3");
        list.add("Test 10");
        list.add("Test 5");
        model.addAttribute("zmienna", new Random().nextInt()); //wartość losowa z przedziału int
        model.addAttribute("lista", list); // dodaje liste
        return "Home"; //Home.html
    }
}
