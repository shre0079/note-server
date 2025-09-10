package com.vivek.notes.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {

    @jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Notes> notes =new ArrayList<>();
}
