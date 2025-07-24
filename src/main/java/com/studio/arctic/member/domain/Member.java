package com.studio.arctic.member.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Table(name = "p_member")
@Entity
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  @Column(name = "name")
  private String name; // 이름

  @Column(name = "email", nullable = false, unique = true)
  private String email; // 이메일

  @Column(name = "password")
  private String password; // 비밀번호

  @Builder.Default
  @Enumerated(EnumType.STRING)
  @Column(name = "user_role", nullable = false)
  private UserRole userRole = UserRole.USER;

  @Enumerated(EnumType.STRING)
  @Column(name = "social_type")
  private SocialType socialType;

  @Column(name = "social_id")
  private String socialId;

}
