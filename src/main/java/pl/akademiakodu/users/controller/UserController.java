package pl.akademiakodu.users.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.users.model.User;


// sprawiamy, że klasa staje się kontrolerem
// kontroler odpowedzialny jest za żądanie http
@Controller
public class UserController {


    // definiowanie ścieżki głównej
    // ktoś wpisał ścieżkę główną wywołana jest metoda hello
    @GetMapping("/")
    public String hello(){
        return "form"; // zwróć htmla: resources/templates/form.html
    }


    // Za pomocą requestParam odbieramy zmienne z HTTP
    // za pomocą ModelMap przekazujemy dane z kontrolera do HTML
    // modelMap to Mapa- prezentacja Kolekcje
    @GetMapping("/add")
    public String add(@RequestParam String username,
                      @RequestParam String email,
                      @RequestParam String brand,
                      @RequestParam String type,
                      @RequestParam int price,
                      ModelMap map){
        User user = new User(); // tworzenie pustego użytkownika
        user.setUsername(username); // przypisanie username
        user.setBrand(brand);
        user.setEmail(email);// przypsisanie adresu email
        user.setType(type);
        user.setPrice(price);
        map.put("user",user);
        // wyświetlamy plik resources/templates/show.html
        return "show";
    }


}
