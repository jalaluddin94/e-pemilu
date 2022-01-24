package com.government.ePemilu.models;

import javax.persistence.*;

@Entity
@Table(name="tbl_voters")
public class Voters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idVoter;

    @Column
    private String nikVoter;

    @Column
    private String namaLengkapVoter;

    public int getIdVoter(){
        return idVoter;
    }

    public String getNikVoter(){
        return nikVoter;
    }

    public void setNikVoter(String nik){
        this.nikVoter = nik;
    }

    public String getNamaLengkapVoter(){
        return namaLengkapVoter;
    }

    public void setNamaLengkapVoter(String namaLengkap){
        this.namaLengkapVoter = namaLengkap;
    }
}
