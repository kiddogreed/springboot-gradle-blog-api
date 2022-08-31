package blog.api.service.impl;

import org.springframework.stereotype.Service;

import blog.api.model.Post;
import blog.api.payload.PostDto;
import blog.api.repository.PostRepository;
import blog.api.service.PostService;

@Service
public class PostServiceImpl implements PostService {
  
  private PostRepository postRepository;

//generate Constructor
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public PostDto createPostDto(PostDto postDto) {
    // TODO Auto-generated method stub
       //convert DTO -> entity
       Post post = new Post();
       //
       post.setTitle(postDto.getTitle());
       post.setDescription(postDto.getDescription());
       post.setContent(postDto.getContent());
       Post newPost = postRepository.save(post);

       //convert entity ->DTO(data transfer object )
       PostDto postResponse = new PostDto();
       //
       postResponse.setId(newPost.getId());
       postResponse.setTitle(newPost.getTitle());
       postResponse.setDescription(newPost.getDescription());
       postResponse.setContent(newPost.getContent());

       return postResponse;
    //return null;
  }
  

}
