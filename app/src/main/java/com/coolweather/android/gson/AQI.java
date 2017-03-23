package com.coolweather.android.gson;

/**
 * Created by XuShenghui on 3/20 0020.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
