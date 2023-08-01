package com.example.demo.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "name")
    private String name;
    @Column(name="email")
    private String email;

//    @OneToMany(targetEntity = Posts.class, cascade = CascadeType.ALL)
//    @JoinColumn(name="user_id", referencedColumnName = "id")
//    private List<Posts> users;
}
