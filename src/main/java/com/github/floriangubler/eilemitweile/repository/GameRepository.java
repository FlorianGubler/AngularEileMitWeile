package com.github.floriangubler.eilemitweile.repository;

import com.github.floriangubler.eilemitweile.entity.GameEntity;
import com.github.floriangubler.eilemitweile.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GameRepository extends JpaRepository<GameEntity, UUID> {
    @Query("select s from GAME s join s.memberrankmap m where ?1 in (VALUE(m))")
    List<GameEntity> findUserGames(UUID memberid);
}
