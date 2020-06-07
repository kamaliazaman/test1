/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootsc.springsc.controllers;

import com.springbootsc.springsc.models.Booking;
import com.springbootsc.springsc.repositories.BookingRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sueha
 */
//@RestController
@Controller
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping("/booking")
    public String booking(Model model) {
        model.addAttribute("booking", bookingRepository.findAll());
        return "booking";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String custName, @RequestParam String custAddress, @RequestParam String mobileno, @RequestParam String facility, @RequestParam String status, @RequestParam Integer hour) {
        Booking booking = new Booking();
        booking.setCustName(custName);
        booking.setCustAddress(custAddress);
        booking.setMobileno(mobileno);
        booking.setFacility(facility);
        booking.setStatus(status);
        booking.setHour(hour);
        
        
        
       
        
       
       
     
        bookingRepository.save(booking);

        return "redirect:/show/" + booking.getId();
    }

    @RequestMapping("/show/{id}")
    public String show(@PathVariable String id, Model model) {
        model.addAttribute("booking", bookingRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        bookingRepository.delete(booking.get());

        return "redirect:/booking";
    }
    
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("booking", bookingRepository.findById(id).get());
        return "edit";
    }
    
    @RequestMapping("/update")
    public String update(@RequestParam String id, @RequestParam String custName, @RequestParam String custAddress, @RequestParam String mobileno, @RequestParam String facility, @RequestParam String status) {
        Optional<Booking> booking = bookingRepository.findById(id);
        booking.get().setCustName(custName);
        booking.get().setCustAddress(custAddress);
        booking.get().setMobileno(mobileno);
        booking.get().setFacility(facility);
        booking.get().setStatus(status);
        bookingRepository.save(booking.get());

        return "redirect:/show/" + booking.get().getId();
    }
    
     
}
