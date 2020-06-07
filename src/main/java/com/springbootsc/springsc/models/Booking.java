/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootsc.springsc.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author sueha
 */
@Document(collection = "booking")
public class Booking {
    @Id
    String id;
    String custName;
    String custAddress;
    String mobileno;
    String facility;
    String status;
    int hour;
   
    
    public Booking() {
        }
    
        public Booking(String custName, String custAddress, String mobileno, String facility, String status, int hour) {
            this.custName = custName;
            this.custAddress = custAddress;
            this.mobileno = mobileno;
            this.facility = facility;
            this.status = status;
            this.hour= hour;
            
        }
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getCustName() {
            return custName;
        }
    
        public void setCustName(String custName) {
            this.custName = custName;
        }
    
        public String getCustAddress() {
            return custAddress;
        }
    
        public void setCustAddress(String custAddress) {
            this.custAddress = custAddress;
        }
    
        public String getMobileno() {
            return mobileno;
        }
    
        public void setMobileno(String mobileno) {
            this.mobileno = mobileno;
        }
    
        public String getFacility() {
            return facility;
        }
    
        public void setFacility(String facility) {
            this.facility = facility;
       }
       
       public String getStatus() {
            return status;
       }
           
       public void setStatus(String status) {
            this.status = status;
       }
       
       
       public int getHour(){
           if (facility=="Meeting Room"){
               return hour=5*hour;
           }
           else if(facility=="Sport Hall"){
               return hour=18*hour;
           }
           else if(facility=="Bilik Kuliah"){
               return hour=8*hour;
           }
           else 
               return hour=10*hour;
           
       }
       
       public void setHour(int hour){
           this.hour= hour;
       }
       
           
       
      
       
       

   
}
