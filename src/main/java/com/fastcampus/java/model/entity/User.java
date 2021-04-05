package com.fastcampus.java.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

// 클래스의 명은 DB의 테이블명과 동일하게.
// 만약 클래스의 명과 DB의 테이블 명과 동일하다면 @Table 안해도 자동으로 JPA에서 매핑됨.
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    //JPA의 Entity 및 Column 은 자동으로 camel case -> DB의 snake_case에 매칭시켜준다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String account;

    private String email;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;
}
