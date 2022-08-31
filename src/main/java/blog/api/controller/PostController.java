package blog.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blog.api.payload.PostDto;
import blog.api.service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * PostController
 */

 @RestController
 @RequestMapping("/grdl/api/posts")
public class PostController {

  private PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;

  }


  //create post
  @PostMapping
  public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
      //TODO: process POST request
      return new ResponseEntity<>(postService.createPostDto(postDto),HttpStatus.CREATED);
  }
  
  
}