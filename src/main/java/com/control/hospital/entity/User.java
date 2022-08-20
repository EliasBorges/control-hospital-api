package com.control.hospital.entity;

import com.control.hospital.controller.user.request.ChangePasswordRequest;
import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User {
    @Id
    @Column(
            updatable = false,
            unique = true,
            nullable = false
    )
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(
            unique = true,
            nullable = false
    )
    private String username;

    @Column(
            nullable = false,
            length = 100
    )
    private String password;

    @Column(
            nullable = false,
            name = "created_at"
    )
    private LocalDateTime createdAt;

    @Column(
            nullable = false,
            name = "update_at"
    )
    private LocalDateTime updatedAt;


    public static User create(
            UserRequest request,
            UserRepository repository
    ) {
        return repository.save(
                new User(
                        UUID.randomUUID().toString(),
                        request.getName(),
                        request.getUsername(),
                        new BCryptPasswordEncoder().encode(request.getPassword()),
                        LocalDateTime.now(),
                        LocalDateTime.now())
        );
    }

    public void updatePassword(
            ChangePasswordRequest request,
            UserRepository repository
    ) {
        this.updatedAt = LocalDateTime.now();
        this.password = new BCryptPasswordEncoder().encode(request.getNewPassword());

        repository.save(this);
    }
}
