package ru.maxdadude.blog.repository;


import org.springframework.data.repository.CrudRepository;
import ru.maxdadude.blog.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
