package blog.api.model;
//same as Post.java(entity /model)


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
  name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"Title"})}

)
public class Post {

  @Id
  @GeneratedValue(
          strategy = GenerationType.IDENTITY
  )
  private long id;

  @Column(name = "title",nullable = false)
  private String title;

  @Column(name = "description",nullable = false)
  private String description;

  @Column(name = "content ",nullable = false)
  private String content;
}
