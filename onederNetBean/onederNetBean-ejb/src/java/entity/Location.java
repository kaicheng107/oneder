package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    private String cc_name;
    private String cc_type;
    private String address_building_name;
    private int address_blk_number;
    private String address_street_name;
    private int postal_code;
    private double cc_long;
    private double cc_lat;    
    
    public Location(String cc_name, String cc_type, String address_building_name, int address_blk_number, String address_street_name, int postal_code, double cc_long, double cc_lat) {
        this.cc_name = cc_name;
        this.cc_type = cc_type;
        this.address_building_name = address_building_name;
        this.address_blk_number = address_blk_number;
        this.address_street_name = address_street_name;
        this.postal_code = postal_code;
        this.cc_long = cc_long;
        this.cc_lat = cc_lat;                
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
    
    /**
     * @return the cc_name
     */
    public String getCc_name() {
        return cc_name;
    }

    /**
     * @param cc_name the cc_name to set
     */
    public void setCc_name(String cc_name) {
        this.cc_name = cc_name;
    }

    /**
     * @return the cc_type
     */
    public String getCc_type() {
        return cc_type;
    }

    /**
     * @param cc_type the cc_type to set
     */
    public void setCc_type(String cc_type) {
        this.cc_type = cc_type;
    }

    /**
     * @return the address_building_name
     */
    public String getAddress_building_name() {
        return address_building_name;
    }

    /**
     * @param address_building_name the address_building_name to set
     */
    public void setAddress_building_name(String address_building_name) {
        this.address_building_name = address_building_name;
    }

    /**
     * @return the address_blk_number
     */
    public int getAddress_blk_number() {
        return address_blk_number;
    }

    /**
     * @param address_blk_number the address_blk_number to set
     */
    public void setAddress_blk_number(int address_blk_number) {
        this.address_blk_number = address_blk_number;
    }

    /**
     * @return the address_street_name
     */
    public String getAddress_street_name() {
        return address_street_name;
    }

    /**
     * @param address_street_name the address_street_name to set
     */
    public void setAddress_street_name(String address_street_name) {
        this.address_street_name = address_street_name;
    }

    /**
     * @return the postal_code
     */
    public int getPostal_code() {
        return postal_code;
    }

    /**
     * @param postal_code the postal_code to set
     */
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    /**
     * @return the cc_long
     */
    public double getCc_long() {
        return cc_long;
    }

    /**
     * @param cc_long the cc_long to set
     */
    public void setCc_long(double cc_long) {
        this.cc_long = cc_long;
    }

    /**
     * @return the cc_lat
     */
    public double getCc_lat() {
        return cc_lat;
    }

    /**
     * @param cc_lat the cc_lat to set
     */
    public void setCc_lat(double cc_lat) {
        this.cc_lat = cc_lat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Location[ id=" + locationId + " ]";
    }
    
}
