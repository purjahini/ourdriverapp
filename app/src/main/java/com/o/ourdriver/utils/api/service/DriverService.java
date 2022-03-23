package com.o.ourdriver.utils.api.service;

import com.o.ourdriver.json.AcceptRequestJson;
import com.o.ourdriver.json.AcceptResponseJson;
import com.o.ourdriver.json.ChangePassRequestJson;
import com.o.ourdriver.json.GetOnRequestJson;
import com.o.ourdriver.json.UpdateLocationRequestJson;
import com.o.ourdriver.json.AllTransResponseJson;
import com.o.ourdriver.json.DetailRequestJson;
import com.o.ourdriver.json.DetailTransResponseJson;
import com.o.ourdriver.json.EditKendaraanRequestJson;
import com.o.ourdriver.json.EditprofileRequestJson;
import com.o.ourdriver.json.GetHomeRequestJson;
import com.o.ourdriver.json.GetHomeResponseJson;
import com.o.ourdriver.json.LoginRequestJson;
import com.o.ourdriver.json.LoginResponseJson;
import com.o.ourdriver.json.PrivacyRequestJson;
import com.o.ourdriver.json.PrivacyResponseJson;
import com.o.ourdriver.json.RegisterRequestJson;
import com.o.ourdriver.json.RegisterResponseJson;
import com.o.ourdriver.json.ResponseJson;
import com.o.ourdriver.json.TopupRequestJson;
import com.o.ourdriver.json.TopupResponseJson;
import com.o.ourdriver.json.VerifyRequestJson;
import com.o.ourdriver.json.WalletRequestJson;
import com.o.ourdriver.json.WalletResponseJson;
import com.o.ourdriver.json.WithdrawRequestJson;
import com.o.ourdriver.json.WithdrawResponseJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface DriverService {

    @POST("driver/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("driver/update_location")
    Call<ResponseJson> updatelocation(@Body UpdateLocationRequestJson param);

    @POST("driver/syncronizing_account")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("driver/logout")
    Call<GetHomeResponseJson> logout(@Body GetHomeRequestJson param);

    @POST("driver/turning_on")
    Call<ResponseJson> turnon(@Body GetOnRequestJson param);

    @POST("driver/accept")
    Call<AcceptResponseJson> accept(@Body AcceptRequestJson param);

    @POST("driver/start")
    Call<AcceptResponseJson> startrequest(@Body AcceptRequestJson param);

    @POST("driver/finish")
    Call<AcceptResponseJson> finishrequest(@Body AcceptRequestJson param);

    @POST("driver/edit_profile")
    Call<LoginResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("driver/edit_kendaraan")
    Call<LoginResponseJson> editKendaraan(@Body EditKendaraanRequestJson param);

    @POST("driver/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("driver/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("driver/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("driver/register_driver")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @POST("driver/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


    @POST("pelanggan/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("pelanggan/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("driver/withdraw")
    Call<WithdrawResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("pelanggan/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("driver/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("driver/verifycode")
    Call<ResponseJson> verifycode(@Body VerifyRequestJson param);


}
