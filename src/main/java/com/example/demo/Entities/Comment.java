package com.example.demo.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @Column(name= "name")
    private String name;
//    @Column(name= "email")
//    private String email;
    @Column(name= "body")
    private String body;
    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName = "id")
    private Post post;
}