package com.bakman.spring_it.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@RequiredArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private @NonNull String name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

}
