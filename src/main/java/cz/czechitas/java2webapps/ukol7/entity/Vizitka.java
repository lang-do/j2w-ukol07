package cz.czechitas.java2webapps.ukol7.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Vizitka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(max = 100)
    @NotBlank
    private String celeJmeno;

    @Length(max = 100)
    @NotBlank
    private String firma;

    @Length(max = 100)
    @NotBlank
    private String ulice;

    @Length(max = 100)
    @NotBlank
    private String obec;

    @Length(min = 5, max = 5)
    @NotBlank
    private String psc;

    @Email
    @Length(max = 100)
    private String email;

    @Length(min = 6, max = 20)
    @Pattern(regexp = "\\+?\\d+")
    private String telefon;

    @Length(max = 100)
    private String web;

    public Vizitka(Integer id, @Length(max = 100) @NotBlank String celeJmeno, @Length(max = 100) @NotBlank String firma, @Length(max = 100) @NotBlank String ulice, @Length(max = 100) @NotBlank String obec, @Length(min = 5, max = 5) @NotBlank String psc, @Email @Length(max = 100) String email, @Length(min = 9, max = 13) @Pattern(regexp = "\\+?\\d+") String telefon, @Length(max = 100) String web) {
        this.id = id;
        this.celeJmeno = celeJmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public Vizitka() {
    }

    public Integer getId() {
        return id;
    }

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObec() {
        return obec;
    }

    public String getPsc() {
        return psc;
    }

    public String getCelaAdresa() {
        return ulice + ", " + obec + ", " + psc;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}