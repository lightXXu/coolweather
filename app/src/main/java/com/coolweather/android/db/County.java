package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
import org.w3c.dom.ProcessingInstruction;

/**
 * Created by XuShenghui on 3/18 0018.
 */

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private String weatherId;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
