package api_rest_blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class PostController {
    @GetMapping("/posts")
    public List<Post> listarPosts() {

        List<Post> posts = new ArrayList<>();
        posts.add(new Post("post via Java", "01/04/2026"));
        posts.add(new Post("Spring Boot pros fortes", "02/04/2026"));
        return posts;
    }
}
