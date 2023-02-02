package com.example.msalvatore22.CareerWinsAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class WinService {

    @Autowired
    private WinRepository winRepository;

    public List<Win> allWins() {
        return winRepository.findAll();
    }

    public Optional<Win> winById(ObjectId objectId) {
        return winRepository.findById(objectId);
    }

    public Win saveOrUpdateWin(Win win) {
        return winRepository.save(win);
    }

}