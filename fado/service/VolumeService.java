package com.fado.service;

import com.fado.entitiy.Volume;
import com.fado.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolumeService {
    @Autowired
    public VolumeRepository repo;

    public List<Volume> listAll() { return repo.findAll();}
    public Volume getMoveByCode(String code) {return repo.findByCode(code);}
    public Volume getMoveByVolume(long volume) {return repo.findByVolume(volume);}


}
