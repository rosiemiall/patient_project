package com.example.patient_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.patient_project.services.RoomService;

@RestController
@RequestMapping(value= "rooms")
public class RoomController {
    @Autowired
    RoomService roomService;
}
