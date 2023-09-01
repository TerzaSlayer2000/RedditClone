package com.sain.spring.redditclone.repository;

import com.sain.spring.redditclone.model.Comment;
import com.sain.spring.redditclone.model.Post;
import com.sain.spring.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
