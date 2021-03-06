package com.moc.smartmeterapp.preferences;

import com.moc.smartmeterapp.model.Limit;

import java.io.Serializable;

/**
 * Created by michael on 22.12.15.
 */

public class MyPreferences implements Serializable{
    private Limit limit1;
    private Limit limit2;
    private Limit limit3;
    private String limit3Color;

    private String ipAddress;
    private Boolean autoSync;
    private Boolean unSynced;

    public MyPreferences(Limit limit1, Limit limit2, Limit limit3,
                         String ipAddress, Boolean autoSync, Boolean unSynced) {
        this.limit1 = limit1;
        this.limit2 = limit2;
        this.limit3 = limit3;
        this.ipAddress = ipAddress;
        this.autoSync = autoSync;
        this.unSynced = unSynced;
    }

    public MyPreferences(){
    }

    public Limit getLimit1() {
        return limit1;
    }

    public Limit getLimit2() {
        return limit2;
    }

    public Limit getLimit3() {
        return limit3;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Boolean getAutoSync() {
        return autoSync;
    }

    public Boolean getUnSynced(){
        return unSynced;
    }

    public void setLimit1(Limit limit1) {
        this.limit1 = limit1;
    }

    public void setLimit2(Limit limit2) {
        this.limit2 = limit2;
    }

    public void setLimit3(Limit limit3) {
        this.limit3 = limit3;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setAutoSync(Boolean autoSync) {
        this.autoSync = autoSync;
    }

    public void setUnSynced(Boolean unSynced){
        this.unSynced = unSynced;
    }
}
