package com.fado.repository;

import com.fado.entitiy.InvestarMove;
import com.fado.entitiy.Volume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VolumeRepository extends JpaRepository<Volume, String> {
    @Query(value="SELECT * FROM volume WHERE volume LIMIT 10", nativeQuery = true)
    List<Volume> findAll();
    Volume findByCode (String code);
    Volume findByVolume (long volume);
}
