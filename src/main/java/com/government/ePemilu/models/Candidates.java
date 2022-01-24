package com.government.ePemilu.models;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;

@ApiModel(description="All details about presidential canditates")
@Entity
@Table(name="tbl_candidates")
public class Candidates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private int idCapres;

    @Column
    private int idCawapres;

    @Column
    private int noUrut;

    @Column
    private int tahun;

    public int getCandidateId(){
        return id;
    }

    public int getCapresId(){
        return idCapres;
    }

    public void setIdCapres(int inputId){
        this.idCapres = inputId;
    }

    public int getCawapresId(){
        return idCawapres;
    }

    public void setIdCawapres(int inputId){
        this.idCawapres = inputId;
    }

    public int getNoUrut(){
        return noUrut;
    }

    public void setNoUrut(int inputNoUrut){
        this.noUrut = inputNoUrut;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int inputTahun){
        this.tahun = inputTahun;
    }
}
