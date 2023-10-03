package com.daily.dailymark_backend.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long userNo;

    @Column(name = "user_id", unique = true)
    private String userId;

    @Column(name = "nickname")
    private String nickname;

    @CreationTimestamp
    private LocalDateTime regDate;

}
