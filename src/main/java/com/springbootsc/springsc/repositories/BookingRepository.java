/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootsc.springsc.repositories;

import com.springbootsc.springsc.models.Booking;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sueha
 */
public interface BookingRepository extends CrudRepository<Booking, String> {
    
    @Override
    public void delete(Booking booking);
    
}
