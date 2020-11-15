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
public class Vehicle {
    private int id;
    private String vehiclename;
    private String vehiclenum;
    private String drivername;
    private String phonenumber;

    public Vehicle(int id, String vehiclename, String vehiclenum, String drivername, String phonenumber) {
        this.id = id;
        this.vehiclename = vehiclename;
        this.vehiclenum = vehiclenum;
        this.drivername = drivername;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", vehiclename=" + vehiclename + ", vehiclenum=" + vehiclenum + ", drivername=" + drivername + ", phonenumber=" + phonenumber + '}';
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getVehiclenum() {
        return vehiclenum;
    }

    public void setVehiclenum(String vehiclenum) {
        this.vehiclenum = vehiclenum;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
}
