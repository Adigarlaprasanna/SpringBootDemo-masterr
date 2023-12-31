package com.example.demo.Repository;

import com.example.demo.Entities.Comment;
import com.example.demo.dto.CommentsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {
    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.userId,c.body) FROM Posts p JOIN p.posts c")
    public List<CommentsResponse> getCommentsInformation();


    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.userId,c.body) FROM Posts p JOIN p.posts c where p.id =:id")
    public List<CommentsResponse> getCommentsById(@Param("id") long id);


    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.userId,c.body) FROM Posts p JOIN p.posts c where c.id =:id")
    public CommentsResponse getCommentById(@Param("id") long id);

}