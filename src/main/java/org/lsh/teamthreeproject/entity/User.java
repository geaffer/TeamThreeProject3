package org.lsh.teamthreeproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true) // userId에만 유니크 제약 조건 추가
    private long userId;


    @Column(name = "login_id", length = 255, nullable = false)
    private String loginId;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 255, nullable = false)
    private String email;

    @Column(name = "reg_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private LocalDateTime regDate;

    @Column(name = "profile_image", length = 255)
    private String profileImage;

    @Column(length = 20)
    private String nickname;

    @Column(length = 255)
    private String introduce;
}
