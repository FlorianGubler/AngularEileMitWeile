package com.github.floriangubler.eilemitweile.repository;

import com.github.floriangubler.eilemitweile.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<MemberEntity, UUID> {
    List<MemberEntity> findAll();

    Optional<MemberEntity> findByEmail(String email);

    void deleteById(UUID memberid);
}
