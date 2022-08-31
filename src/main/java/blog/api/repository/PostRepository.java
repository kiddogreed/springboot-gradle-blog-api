package blog.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import blog.api.model.Post;

//it should be interface
public interface PostRepository extends JpaRepository<Post, Long>{
}
