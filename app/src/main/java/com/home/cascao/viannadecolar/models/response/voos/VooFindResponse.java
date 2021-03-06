package com.home.cascao.viannadecolar.models.response.voos;

import com.google.gson.annotations.SerializedName;
import com.home.cascao.viannadecolar.models.Voo;

import java.util.List;

public class VooFindResponse {

    @SerializedName("voos")
    private List<Voo> voos;

    public VooFindResponse() { }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

}
