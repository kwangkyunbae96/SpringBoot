package com.fastcampus.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}

}

// Entity : JPA에서는 테이블을 자동으로 생성해주는 기능 존재.
/*
@Entity : 해당 Class가 Entity임을 명시
@Table : 실제 DB테이블의 이름을 명시
@Id : index primary key를 명시
@Column 실제 DB Column의 이름을 명시
@GeneratedValue Primary key 식별키의 전략 설정


 */