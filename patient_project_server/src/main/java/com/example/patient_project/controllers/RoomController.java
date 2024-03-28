package com.example.patient_project.controllers;

import com.example.patient_project.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.patient_project.services.RoomService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms(){
        return new ResponseEntity<>(roomService.getAllRooms(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable Long id) {
        Optional<Room> roomByID = roomService.getRoomById(id);
        return new ResponseEntity<>(
                roomByID.orElse(null),
                roomByID.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK
        );
    }
}
