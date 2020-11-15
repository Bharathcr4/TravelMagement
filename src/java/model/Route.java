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
public class Route {
    
    private int id;
    private String routefrom;
    private String routeto;
    private String vehiclenum;
    private String vehicletype;
    private String dateoftravel;

    public Route(int id, String routefrom, String routeto, String vehiclenum, String vehicletype, String dateoftravel) {
        this.id = id;
        this.routefrom = routefrom;
        this.routeto = routeto;
        this.vehiclenum = vehiclenum;
        this.vehicletype = vehicletype;
        this.dateoftravel = dateoftravel;
    }

    @Override
    public String toString() {
        return "Route{" + "id=" + id + ", routefrom=" + routefrom + ", routeto=" + routeto + ", vehiclenum=" + vehiclenum + ", vehicletype=" + vehicletype + ", dateoftravel=" + dateoftravel + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getDateoftravel() {
        return dateoftravel;
    }

    public void setDateoftravel(String dateoftravel) {
        this.dateoftravel = dateoftravel;
    }
    
    

}
