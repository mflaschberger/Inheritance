/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworld;

/**
 *
 * @author mflaschberger
 */
public abstract class Cellphone implements Electronic {
 private String size;
 private String memory;
 private double price;
 
 public String makeCall(){
  return "Ring";   
 } 
}
