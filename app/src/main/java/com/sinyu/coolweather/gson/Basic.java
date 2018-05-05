package com.sinyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sinyu on 2018/5/5.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
