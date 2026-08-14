package ApiRestBlog.repository;

import ApiRestBlog.entity.Post;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface PostRepository extends JpaRepositoryImplementation<Post, Long> {}
