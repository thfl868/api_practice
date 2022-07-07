package com.spring.practice.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder // builder를 사용할수 있게 합니다.
@Entity // jpa entity임을 알립니다.
@Getter // user 필드값의 getter를 자동으로 생성합니다.
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성합니다.
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성합니다.
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MEMBER_SEQ",	//매핑할 DB 시퀀스 이름
        initialValue = 1, allocationSize = 1)
@Table(name = "TestUser") // 'user' 테이블과 매핑됨을 명시
public class User {


    @Id // primaryKey임을 알립니다.
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEMBER_SEQ_GENERATOR")
    private long msrl;

    @Column(nullable = false, unique = true, length = 30) // uid column을 명시합니다. 필수이고 유니크한 필드이며 길이는 30입니다.
    private String uid;

    @Column(nullable = false, length = 100) // name column을 명시합니다. 필1수이고 길이는 100입니다.
    private String name;

}
