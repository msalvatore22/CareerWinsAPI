package com.example.msalvatore22.CareerWinsAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class WinController {

    @Autowired
    private WinService winService;

    @PostMapping("/wins")
    public ResponseEntity<Win> createWin(@RequestBody Win win){
        return new ResponseEntity<>(winService.saveOrUpdateWin(win), HttpStatus.CREATED);
    }

    @GetMapping("/wins")
    public ResponseEntity<List<Win>> getAllWins() {
        return new ResponseEntity<List<Win>>(winService.allWins(), HttpStatus.OK);
    }

    @GetMapping("/wins/{objectId}")
    public ResponseEntity<Optional<Win>> getWinById(@PathVariable ObjectId objectId) {
        return new ResponseEntity<Optional<Win>>(winService.winById(objectId), HttpStatus.OK);
    }

}
