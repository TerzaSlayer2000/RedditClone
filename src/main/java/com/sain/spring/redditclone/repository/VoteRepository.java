package com.sain.spring.redditclone.repository;

import com.sain.spring.redditclone.model.Post;
import com.sain.spring.redditclone.model.User;
import com.sain.spring.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
