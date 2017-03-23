package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by XuShenghui on 3/20 0020.
 */

public class ForeCast {
    public String data;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }


    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
