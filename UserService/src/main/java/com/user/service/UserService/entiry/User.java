package com.user.service.UserService.entiry;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "micor_user")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "Name", length = 30)
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "About")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
