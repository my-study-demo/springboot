package com.kely.oauth2.jpa;


import com.kely.oauth2.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityJPA extends JpaRepository<Authority, String> {
}