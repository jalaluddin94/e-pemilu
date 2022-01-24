package com.government.ePemilu.models;

import javax.persistence.*;

@Entity
@Table(name="tbl_voters")
public class Voters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String nik;

    @Column
    private String namaLengkap;

    public int getIdVoter(){
        return id;
    }

    public String getNikVoter(){
        return nik;
    }

    public void setNikVoter(String inputNik){
        this.nik = inputNik;
    }

    public String getNamaLengkapVoter(){
        return namaLengkap;
    }

    public void setNamaLengkapVoter(String inputNamaLengkap){
        this.namaLengkap = inputNamaLengkap;
    }
}
