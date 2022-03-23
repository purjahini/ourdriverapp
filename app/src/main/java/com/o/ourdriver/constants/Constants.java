package com.o.ourdriver.constants;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by o Team on 10/23/2020.
 */

public class Constants {

    public static final String BASE_URL = "https://bimar.xyz/ouride/";
    public static final String FCM_KEY = "AAAAUZsGINo:APA91bFNN2AxqdwIMNKzF20d1xBfNT3gy5HfxXGiKQUZ8p3q9NmiVDg6LsdiQpUsrlvxQJYxKrL-k0meVn9xuUYyy8hjcd5QzAwRPN8_22X6B_cBjeM0Pj9erfK-Bqwj7h4beqNSG5zW";
    public static final String CONNECTION = BASE_URL + "api/";
    public static final String IMAGESFITUR = BASE_URL + "images/fitur/";
    public static final String IMAGESDRIVER = BASE_URL + "images/fotodriver/";
    public static final String IMAGESUSER = BASE_URL + "images/pelanggan/";
    public static final String IMAGESMERCHANT = BASE_URL + "images/merchant/";
    public static String CURRENCY = "";

    public static Double LATITUDE;
    public static Double LONGITUDE;
    public static String LOCATION;

    public static String TOKEN = "token";

    public static String USERID = "uid";

    public static String PREF_NAME = "pref_name";

    public static int permission_camera_code = 786;
    public static int permission_write_data = 788;
    public static int permission_Read_data = 789;
    public static int permission_Recording_audio = 790;

    public static SimpleDateFormat df =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    public static String versionname = "1.0";

    public static final LatLngBounds BOUNDS = new LatLngBounds(
            new LatLng(-7.216001, 0), // southwest
            new LatLng(0, 107.903316)); // northeast

}
