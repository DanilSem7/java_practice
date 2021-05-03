package com.example.task14.controllers;


import com.example.task14.models.Manufacture;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ManufactureController {
    ArrayList<Manufacture> manufactures = new ArrayList<>();
    @PostMapping("/manufactures/create")
    public String createManufacture(@RequestBody Manufacture manufacture){
        manufactures.add(manufacture);
        manufacture.setId(manufactures.size());
        return manufactures.toString();
    }

    @GetMapping("/manufactures")
    public String allManufactures(){
        return manufactures.toString();
    }

    @DeleteMapping("/manufactures/{manufacture_id}")
    public String deleteManufacture(@PathVariable("manufacture_id") int manufacture_id){
        manufactures.removeIf(o -> o.getId() == manufacture_id);
        return manufactures.toString();
    }
}
