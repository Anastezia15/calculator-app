package com.nastya.calculator.service;

import com.nastya.calculator.model.VolleyballPlayer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//add lombok annotations
public class PlayerService {
    //make field private
    public final List<VolleyballPlayer> players = new ArrayList<>();

    //add method for adding players to the list
}
