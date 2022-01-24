package com.government.ePemilu.models;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;

@ApiModel(description="All details about the politicians")
@Entity
@Table(name="tbl_politicians")
public class Politicians {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String nik;

    @Column
    private String namaLengkap;

    public int getIdPolitician(){
        return id;
    }

    public String getNikPolitician(){
        return nik;
    }

    public void setNikPolitician(String inputNik){
        this.nik = inputNik;
    }

    public String getNamaLengkapPolitician(){
        return namaLengkap;
    }

    public void setNamaLengkapPolitician(String inputNamaLengkap){
        this.namaLengkap = inputNamaLengkap;
    }
}
