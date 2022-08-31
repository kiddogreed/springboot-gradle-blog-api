package blog.api.service;

import blog.api.payload.PostDto;

public interface PostService {
  PostDto createPostDto(PostDto postDto);
}
