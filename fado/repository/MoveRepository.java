package com.fado.repository;

import com.fado.entitiy.InvestarMove;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoveRepository extends JpaRepository<InvestarMove, String> {

    List<InvestarMove> findAll();
    InvestarMove findByAgen(long agen);
    InvestarMove findByFore(long fore);
}
