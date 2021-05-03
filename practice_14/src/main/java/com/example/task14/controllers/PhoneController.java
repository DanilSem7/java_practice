package com.example.task14.controllers;


import com.example.task14.models.Phone;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PhoneController {
    ArrayList<Phone> phones = new ArrayList<>();
    @PostMapping("/phones/create")
    public String createPhone(@RequestBody Phone phone){
        phones.add(phone);
        phone.setId(phones.size());
        return phones.toString();
    }

    @GetMapping("/phones")
    public String allPhones(){
        return phones.toString();
    }

    @DeleteMapping("/phones/{phone_id}")
    public String deletePhone(@PathVariable("phone_id") int phone_id){
        phones.removeIf(o -> o.getId() == phone_id);
        return phones.toString();
    }
}
