/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Book {
     private int id;
     private String name;
       private String phonenum;
     private String routefrom;
    private String routeto;
    private String vehiclenum;
    private String dateoftravel;
      private String pickuppoint;

    public Book(int id, String name, String phonenum, String routefrom, String routeto, String vehiclenum, String dateoftravel, String pickuppoint) {
        this.id = id;
        this.name = name;
        this.phonenum = phonenum;
        this.routefrom = routefrom;
        this.routeto = routeto;
        this.vehiclenum = vehiclenum;
        this.dateoftravel = dateoftravel;
        this.pickuppoint = pickuppoint;
    }

    @Override
    public String toString() {
     return "Book{" + "id=" + id + ",name=" + name + ",phonenum=" + phonenum + ",routefrom=" + routefrom + ", routeto=" + routeto + ", vehiclenum=" + vehiclenum + ",dateoftravel=" + dateoftravel + ",pickuppoint=" + pickuppoint + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getRoutefrom() {
        return routefrom;
    }

    public void setRoutefrom(String routefrom) {
        this.routefrom = routefrom;
    }

    public String getRouteto() {
        return routeto;
    }

    public void setRouteto(String routeto) {
        this.routeto = routeto;
    }

    public String getVehiclenum() {
        return vehiclenum;
    }

    public void setVehiclenum(String vehiclenum) {
        this.vehiclenum = vehiclenum;
    }

    public String getDateoftravel() {
        return dateoftravel;
    }

    public void setDateoftravel(String dateoftravel) {
        this.dateoftravel = dateoftravel;
    }

    public String getPickuppoint() {
        return pickuppoint;
    }

    public void setPickuppoint(String pickuppoint) {
        this.pickuppoint = pickuppoint;
    }
}
      
