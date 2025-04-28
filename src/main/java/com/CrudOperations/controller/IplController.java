package com.CrudOperations.controller;

import com.CrudOperations.entity.IplTeam;
import com.CrudOperations.service.IplService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IplController {
    IplService iplService;

    public IplController(IplService iplService) {
        this.iplService = iplService;
    }

    @PostMapping("/insert")
    public ResponseEntity<IplTeam> insertdata(@RequestBody IplTeam iplTeam){
        IplTeam savedIplTeam = iplService.insertdata(iplTeam);
        return new ResponseEntity<IplTeam>(savedIplTeam, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<IplTeam>> getAllTeams(){
        List<IplTeam> iplteams = iplService.getAllTeams();
        return ResponseEntity.ok(iplteams);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<IplTeam> update(@PathVariable int id, @RequestBody IplTeam iplTeam){
        IplTeam updateTeam = iplService.updateTeam(id, iplTeam);

        return new ResponseEntity<IplTeam>(updateTeam, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>>delete(@PathVariable int id){
        iplService.delete(id);
        Map<String, Boolean>response = new HashMap<String, Boolean>();
        response.put("Deleted", Boolean.TRUE);

        return ResponseEntity.ok(response);
    }

}
