package ApiRestBlog.controller;

import ApiRestBlog.entity.Post;
import ApiRestBlog.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/api/posts")
    public List<Post> post(){ return postService.getAllPosts();}
}
