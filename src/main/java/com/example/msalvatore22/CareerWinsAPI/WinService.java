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

    public Win saveWin(Win win) {
        return winRepository.save(win);
    }

    public Win updateWinById(ObjectId objectId, Win win){

        Optional<Win> winLookup = winRepository.findById(objectId);

        Win winValues = winLookup.get();

        winValues.setTitle(win.getTitle());
        winValues.setDescription(win.getDescription());
        winValues.setYearMonth(win.getYearMonth());
        winValues.setHighlight(win.getHighlight());
        winValues.setImpact(win.getImpact());
        winValues.setUpdatedAt(win.getUpdatedAt());

        return winRepository.save(winValues);
    }
    public String deleteById(ObjectId objectId) {
        winRepository.deleteById(objectId);
        return "Deleted successfully";
    }
}