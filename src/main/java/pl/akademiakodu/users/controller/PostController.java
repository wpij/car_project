package pl.akademiakodu.users.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.users.model.Post;

@Controller
public class PostController {

    // ścieżka localhost:8080/posts/add
    @GetMapping("/posts/add")
    public String add(){
        // ma być wysświetlony plik add.html
        // z katalogu templates/posts
        return "posts/add";
    }

    @PostMapping("/posts/add")
    public String show(@RequestParam String title,
                       @RequestParam String author,
                       @RequestParam String content,
                       ModelMap map){
        Post post = new Post(title,author,content);
        map.put("post",post);
        return "posts/show";
    }
}
