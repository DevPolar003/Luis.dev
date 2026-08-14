package ApiRestBlog.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Post")
public class Post {
    private String titulo;
    private String date;

    public Post(){}

}