package com.example.producto.Entity;

import jakarta.persistence.*;



@Entity
@Table(name="Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Code", length = 50)
    private String code;
    @Column(name = "Water", length = 50)
    private String Water;
    @Column(name = "Glutar", length = 50)
    private String Glutar;
    @Column(name = "Propile", length = 50)
    private String Propile;
    @Column(name = "Brisam", length = 50)
    private String Brisam;
    @Column(name = "Fosfato", length = 50)
    private String Fosfato;
    @Column(name = "Green", length = 50)
    private String Green;

    @Column(name = "conwater", length = 50)
    private String conwater;
    @Column(name = "conglutar", length = 50)
    private String conglutar;
    @Column(name = "conpropile", length = 50)
    private String conpropile;
    @Column(name = "conbrisam", length = 50)
    private String conbrisam;
    @Column(name = "confosfato", length = 50)
    private String confosfato;
    @Column(name = "congreen", length = 50)
    private String congreen;
    @Column(name = "lotewater", length = 50)
    private String lotewater;
    @Column(name = "loteglutar", length = 50)
    private String loteglutar;
    @Column(name = "lotepropile", length = 50)
    private String lotepropile;
    @Column(name = "lotebrisam", length = 50)
    private String lotebrisam;
    @Column(name = "lotefosfato", length = 50)
    private String lotefosfato;
    @Column(name = "lotegreen", length = 50)
    private String lotegreen;

    @Column(name = "anaWater", length = 50)
    private String anaWater;
    @Column(name = "anaGlutar", length = 50)
    private String anaGlutar;
    @Column(name = "anaPropile", length = 50)
    private String anaPropile;
    @Column(name = "anaBrisam", length = 50)
    private String anaBrisam;
    @Column(name = "anaFosfato", length = 50)
    private String anaFosfato;
    @Column(name = "anaGreen", length = 50)
    private String anaGreen;

    @Column(name = "teoWater", length = 50)
    private String teoWater;
    @Column(name = "teoGlutar", length = 50)
    private String teoGlutar;
    @Column(name = "teoPropile", length = 50)
    private String teoPropile;
    @Column(name = "teoBrisam", length = 50)
    private String teoBrisam;
    @Column(name = "teoFosfato", length = 50)
    private String teoFosfato;
    @Column(name = "teoGreen", length = 50)
    private String teoGreen;

    @Column(name = "cantiReal", length = 50)
    private String cantiReal;
    @Column(name = "cantiFalta", length = 50)
    private String cantiFalta;
    @Column(name = "rendimiento", length = 50)
    private String rendimiento;

    @Column(name = "horaIni", length = 50)
    private String horaIni;
    @Column(name = "horFini", length = 50)
    private String horFini;
    @Column(name = "diaAco", length = 50)
    private String diaAco;

    @Column(name = "Revisado", length = 50)
    private String Revisado;
    @Column(name = "Responsable", length = 50)
    private String Responsable;

    @Column(name = "Value")
    private boolean Value;
    @Column(name = "Value1")
    private boolean Value1;
    @Column(name = "Value2")
    private boolean Value2;
    @Column(name = "Value3")
    private boolean Value3;
    @Column(name = "Value4")
    private boolean Value4;
    @Column(name = "Value5")
    private boolean Value5;
    @Column(name = "Value6")
    private boolean Value6;
    @Column(name = "Value7")
    private boolean Value7;
    @Column(name = "Value8")
    private boolean Value8;

    @Column(name = "PesadoPor", length = 50)
    private String PesadoPor;
    @Column(name = "VerificadoPor", length = 50)
    private String VerificadoPor;
    @Column(name = "RealizadoPor", length = 50)
    private String RealizadoPor;

    @Column(name = "Value9")
    private boolean Value9;
    @Column(name = "Value10")
    private boolean Value10;
    @Column(name = "Value11")
    private boolean Value11;
    @Column(name = "Value12")
    private boolean Value12;
    @Column(name = "Value13")
    private boolean Value13;
    @Column(name = "Value14")
    private boolean Value14;
    @Column(name = "Value15")
    private boolean Value15;
    @Column(name = "Value16")
    private boolean Value16;
    @Column(name = "Value17")
    private boolean Value17;

    @Column(name = "Obser")
    private String Obser;

    @Column(name = "FechaAna", length = 50)
    private String FechaAna;

    @Column(name = "Canti", length = 50)
    private String Canti;

    @Column(name = "espeolor", length = 50)
    private String espeolor;
    @Column(name = "especolor", length = 50)
    private String especolor;
    @Column(name = "espedensi", length = 50)
    private String espedensi;
    @Column(name = "espeph" , length = 50)
    private String espeph;
    @Column(name = "metoolor", length = 50)
    private String metoolor;
    @Column(name = "metocolor", length = 50)
    private String metocolor;
    @Column(name = "metodensi", length = 50)
    private String metodensi;
    @Column(name = "metoph", length = 50)
    private String metoph;
    @Column(name = "olor", length = 50)
    private String olor;
    @Column(name = "color", length = 50)
    private String color;
    @Column(name = "densidad", length = 50)
    private String densidad;
    @Column(name = "ph", length = 50)
    private String ph;
    @Column(name = "AnalisadoPor", length = 50)
    private String AnalisadoPor;
    @Column(name = "Obser1")
    private String Obser1;
    @Column(name = "Value30")
    private boolean Value30;

    //page4


    @Column(name = "fechaini1", length = 50)
    private String fechaini1;

    @Column(name = "emitido", length = 50)
    private String emitido;
    @Column(name = "horaini1", length = 50)
    private String horaini1;
    @Column(name = "horafini3", length = 50)
    private String horafini3;
    @Column(name = "presentacion", length = 50)
    private String presentacion;
    @Column(name = "unidades", length = 50)
    private String unidades;
    @Column(name = "fechafini2", length = 50)
    private String fechafini2;
    @Column(name = "horafini2", length = 50)
    private String horafini2;
    @Column(name = "realizpor", length = 50)
    private String realizpor;
    @Column(name = "fecha", length = 50)
    private String fecha;
    @Column(name = "veripor", length = 50)
    private String veripor;

    @Column(name = "Value18")
    private boolean Value18;
    @Column(name = "Value19")
    private boolean Value19;
    @Column(name = "Value20")
    private boolean Value20;
    @Column(name = "Value21")
    private boolean Value21;
    @Column(name = "Value22")
    private boolean Value22;
    @Column(name = "Value23")
    private boolean Value23;
    @Column(name = "Value24")
    private boolean Value24;
    @Column(name = "Value25")
    private boolean Value25;
    @Column(name = "Value26")
    private boolean Value26;

    //page 5
    @Column(name = "cantidad1", length = 50)
    private String cantidad1;
    @Column(name = "fecha2", length = 50)
    private String fecha2;
    @Column(name = "presentacion1", length = 50)
    private String presentacion1;
    @Column(name = "control", length = 50)
    private String control;
    @Column(name = "especificacion1", length = 50)
    private String especificacion1;
    @Column(name = "medida1", length = 50)
    private String medida1;
    @Column(name = "medida2", length = 50)
    private String medida2;
    @Column(name = "medida3", length = 50)
    private String medida3;
    @Column(name = "medida4", length = 50)
    private String medida4;
    @Column(name = "medida5", length = 50)
    private String medida5;
    @Column(name = "medida6", length = 50)
    private String medida6;
    @Column(name = "hor1", length = 50)
    private String hor1;
    @Column(name = "hor2", length = 50)
    private String hor2;
    @Column(name = "hor3", length = 50)
    private String hor3;
    @Column(name = "hor4", length = 50)
    private String hor4;
    @Column(name = "hor5", length = 50)
    private String hor5;
    @Column(name = "hor6", length = 50)
    private String hor6;
    @Column(name = "reali1", length = 50)
    private String reali1;
    @Column(name = "reali2", length = 50)
    private String reali2;
    @Column(name = "reali3", length = 50)
    private String reali3;
    @Column(name = "reali4", length = 50)
    private String reali4;
    @Column(name = "reali5", length = 50)
    private String reali5;
    @Column(name = "reali6", length = 50)
    private String reali6;

    @Column(name = "prome", length = 50)
    private String prome;
    @Column(name = "noper", length = 50)
    private String noper;
    @Column(name = "horini", length = 50)
    private String horini;
    @Column(name = "horfin", length = 50)
    private String horfin;
    @Column(name = "noenva", length = 50)
    private String noenva;
    @Column(name = "tapasdefe", length = 50)
    private String tapasdefe;
    @Column(name = "envadefe", length = 50)
    private String envadefe;
    @Column(name = "muestras", length = 50)
    private String muestras;

    @Column(name = "noper1", length = 50)
    private String noper1;
    @Column(name = "horini1", length = 50)
    private String horini1;
    @Column(name = "horfin1", length = 50)
    private String horfin1;

    @Column(name = "nouni", length = 50)
    private String nouni;
    @Column(name = "cajasdefe", length = 50)
    private String cajasdefe;
    @Column(name = "etidefe", length = 50)
    private String etidefe;
    @Column(name = "muestras1", length = 50)
    private String muestras1;
    @Column(name = "materialsobra", length = 50)
    private String materialsobra;
    @Column(name = "autoriza", length = 50)
    private String autoriza;



    public Producto() {
    }

    public Producto(int id, String code,String water, String glutar, String propile, String brisam, String fosfato, String green, String conwater, String conglutar, String conpropile, String conbrisam, String confosfato, String congreen, String lotewater, String loteglutar, String lotepropile, String lotebrisam, String lotefosfato, String lotegreen, String anaWater, String anaGlutar, String anaPropile, String anaBrisam, String anaFosfato, String anaGreen, String teoWater, String teoGlutar, String teoPropile, String teoBrisam, String teoFosfato, String teoGreen, String cantiReal, String cantiFalta, String rendimiento, String horaIni, String horafin3, String horFini, String diaAco, String revisado, String responsable, boolean value, boolean value1, boolean value2, boolean value3, boolean value4, boolean value5, boolean value6, boolean value7, boolean value8, String pesadoPor, String verificadoPor, String realizadoPor, boolean value9, boolean value10, boolean value11, boolean value12, boolean value13, boolean value14, boolean value15, boolean value16, boolean value17, String obser, String fechaAna, String canti, String espeolor, String especolor, String espedensi, String espeph, String metoolor, String metocolor, String metodensi, String metoph, String olor, String color, String densidad, String ph, String analisadoPor, String obser1, String fechaini1, String emitido, String horaini1, String presentacion, String unidades, String fechafini2, String horafini2, String realizpor, String fecha, String veripor, boolean value18, boolean value19, boolean value20, boolean value21, boolean value22, boolean value23, boolean value24, boolean value25, boolean value26,boolean value30, String nouni, String cajasdefe, String etidefe, String muestras1, String materialsobra, String autoriza, String cantidad1, String fecha2, String presentacion1, String control, String especificacion1, String medida1, String medida2, String medida3, String medida4, String medida5, String medida6, String hor1, String hor2, String hor3, String hor4, String hor5, String hor6, String reali1, String reali2, String reali3, String reali4, String reali5, String reali6, String noper, String horini, String horfin, String noenva, String tapasdefe, String envadefe, String muestras, String noper1, String horini1, String horfin1, String prome) {
        this.id = id;
        this.code = code;
        Water = water;
        Glutar = glutar;
        Propile = propile;
        Brisam = brisam;
        Fosfato = fosfato;
        Green = green;
        this.conwater = conwater;
        this.conglutar = conglutar;
        this.conpropile = conpropile;
        this.conbrisam = conbrisam;
        this.confosfato = confosfato;
        this.congreen = congreen;
        this.lotewater = lotewater;
        this.loteglutar = loteglutar;
        this.lotepropile = lotepropile;
        this.lotebrisam = lotebrisam;
        this.lotefosfato = lotefosfato;
        this.lotegreen = lotegreen;
        this.anaWater = anaWater;
        this.anaGlutar = anaGlutar;
        this.anaPropile = anaPropile;
        this.anaBrisam = anaBrisam;
        this.anaFosfato = anaFosfato;
        this.anaGreen = anaGreen;
        this.teoWater = teoWater;
        this.teoGlutar = teoGlutar;
        this.teoPropile = teoPropile;
        this.teoBrisam = teoBrisam;
        this.teoFosfato = teoFosfato;
        this.teoGreen = teoGreen;
        this.cantiReal = cantiReal;
        this.cantiFalta = cantiFalta;
        this.rendimiento = rendimiento;
        this.horaIni = horaIni;
        this.horFini = horFini;
        this.diaAco = diaAco;
        Revisado = revisado;
        Responsable = responsable;
        Value = value;
        Value1 = value1;
        Value2 = value2;
        Value3 = value3;
        Value4 = value4;
        Value5 = value5;
        Value6 = value6;
        Value7 = value7;
        Value8 = value8;
        PesadoPor = pesadoPor;
        VerificadoPor = verificadoPor;
        RealizadoPor = realizadoPor;
        Value9 = value9;
        Value10 = value10;
        Value11 = value11;
        Value12 = value12;
        Value13 = value13;
        Value14 = value14;
        Value15 = value15;
        Value16 = value16;
        Value17 = value17;
        Obser = obser;
        FechaAna = fechaAna;
        Canti = canti;
        this.espeolor = espeolor;
        this.especolor = especolor;
        this.espedensi = espedensi;
        this.espeph = espeph;
        this.metoolor = metoolor;
        this.metocolor = metocolor;
        this.metodensi = metodensi;
        this.metoph = metoph;
        this.olor = olor;
        this.color = color;
        this.densidad = densidad;
        this.ph = ph;
        AnalisadoPor = analisadoPor;
        Obser1 = obser1;
        this.fechaini1 = fechaini1;
        this.emitido = emitido;
        this.horaini1 = horaini1;
        this.presentacion = presentacion;
        this.unidades = unidades;
        this.fechafini2 = fechafini2;
        this.horafini2 = horafini2;
        this.realizpor = realizpor;
        this.fecha = fecha;
        this.veripor = veripor;
        Value18 = value18;
        Value19 = value19;
        Value20 = value20;
        Value21 = value21;
        Value22 = value22;
        Value23 = value23;
        Value24 = value24;
        Value25 = value25;
        Value26 = value26;
        Value30 = value30;
        this.nouni = nouni;
        this.cajasdefe = cajasdefe;
        this.etidefe = etidefe;
        this.muestras1 = muestras1;
        this.materialsobra = materialsobra;
        this.autoriza = autoriza;
        this.cantidad1 = cantidad1;
        this.fecha2 = fecha2;
        this.presentacion1 = presentacion1;
        this.control = control;
        this.especificacion1 = especificacion1;
        this.medida1 = medida1;
        this.medida2 = medida2;
        this.medida3 = medida3;
        this.medida4 = medida4;
        this.medida5 = medida5;
        this.medida6 = medida6;
        this.hor1 = hor1;
        this.hor2 = hor2;
        this.hor3 = hor3;
        this.hor4 = hor4;
        this.hor5 = hor5;
        this.hor6 = hor6;
        this.reali1 = reali1;
        this.reali2 = reali2;
        this.reali3 = reali3;
        this.reali4 = reali4;
        this.reali5 = reali5;
        this.reali6 = reali6;
        this.noper = noper;
        this.horini = horini;
        this.horfin = horfin;
        this.noenva = noenva;
        this.tapasdefe = tapasdefe;
        this.envadefe = envadefe;
        this.muestras = muestras;
        this.noper1 = noper1;
        this.horini1 = horini1;
        this.horfin1 = horfin1;
        this.horafini3 = horafini3;
        this.prome = prome;
    }

    public String getProme() {
        return prome;
    }

    public void setProme(String prome) {
        this.prome = prome;
    }

    public String getHorafini3() {
        return horafini3;
    }

    public void setHorafini3(String horafini3) {
        this.horafini3 = horafini3;
    }

    public boolean isValue30() {
        return Value30;
    }

    public void setValue30(boolean value30) {
        Value30 = value30;
    }

    public String getNouni() {
        return nouni;
    }

    public void setNouni(String nouni) {
        this.nouni = nouni;
    }

    public String getCajasdefe() {
        return cajasdefe;
    }

    public void setCajasdefe(String cajasdefe) {
        this.cajasdefe = cajasdefe;
    }

    public String getEtidefe() {
        return etidefe;
    }

    public void setEtidefe(String etidefe) {
        this.etidefe = etidefe;
    }

    public String getMuestras1() {
        return muestras1;
    }

    public void setMuestras1(String muestras1) {
        this.muestras1 = muestras1;
    }

    public String getMaterialsobra() {
        return materialsobra;
    }

    public void setMaterialsobra(String materialsobra) {
        this.materialsobra = materialsobra;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    public String getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(String cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getPresentacion1() {
        return presentacion1;
    }

    public void setPresentacion1(String presentacion1) {
        this.presentacion1 = presentacion1;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getEspecificacion1() {
        return especificacion1;
    }

    public void setEspecificacion1(String especificacion1) {
        this.especificacion1 = especificacion1;
    }

    public String getMedida1() {
        return medida1;
    }

    public void setMedida1(String medida1) {
        this.medida1 = medida1;
    }

    public String getMedida2() {
        return medida2;
    }

    public void setMedida2(String medida2) {
        this.medida2 = medida2;
    }

    public String getMedida3() {
        return medida3;
    }

    public void setMedida3(String medida3) {
        this.medida3 = medida3;
    }

    public String getMedida4() {
        return medida4;
    }

    public void setMedida4(String medida4) {
        this.medida4 = medida4;
    }

    public String getMedida5() {
        return medida5;
    }

    public void setMedida5(String medida5) {
        this.medida5 = medida5;
    }

    public String getMedida6() {
        return medida6;
    }

    public void setMedida6(String medida6) {
        this.medida6 = medida6;
    }

    public String getHor1() {
        return hor1;
    }

    public void setHor1(String hor1) {
        this.hor1 = hor1;
    }

    public String getHor2() {
        return hor2;
    }

    public void setHor2(String hor2) {
        this.hor2 = hor2;
    }

    public String getHor3() {
        return hor3;
    }

    public void setHor3(String hor3) {
        this.hor3 = hor3;
    }

    public String getHor4() {
        return hor4;
    }

    public void setHor4(String hor4) {
        this.hor4 = hor4;
    }

    public String getHor5() {
        return hor5;
    }

    public void setHor5(String hor5) {
        this.hor5 = hor5;
    }

    public String getHor6() {
        return hor6;
    }

    public void setHor6(String hor6) {
        this.hor6 = hor6;
    }

    public String getReali1() {
        return reali1;
    }

    public void setReali1(String reali1) {
        this.reali1 = reali1;
    }

    public String getReali2() {
        return reali2;
    }

    public void setReali2(String reali2) {
        this.reali2 = reali2;
    }

    public String getReali3() {
        return reali3;
    }

    public void setReali3(String reali3) {
        this.reali3 = reali3;
    }

    public String getReali4() {
        return reali4;
    }

    public void setReali4(String reali4) {
        this.reali4 = reali4;
    }

    public String getReali5() {
        return reali5;
    }

    public void setReali5(String reali5) {
        this.reali5 = reali5;
    }

    public String getReali6() {
        return reali6;
    }

    public void setReali6(String reali6) {
        this.reali6 = reali6;
    }

    public String getNoper() {
        return noper;
    }

    public void setNoper(String noper) {
        this.noper = noper;
    }

    public String getHorini() {
        return horini;
    }

    public void setHorini(String horini) {
        this.horini = horini;
    }

    public String getHorfin() {
        return horfin;
    }

    public void setHorfin(String horfin) {
        this.horfin = horfin;
    }

    public String getNoenva() {
        return noenva;
    }

    public void setNoenva(String noenva) {
        this.noenva = noenva;
    }

    public String getTapasdefe() {
        return tapasdefe;
    }

    public void setTapasdefe(String tapasdefe) {
        this.tapasdefe = tapasdefe;
    }

    public String getEnvadefe() {
        return envadefe;
    }

    public void setEnvadefe(String envadefe) {
        this.envadefe = envadefe;
    }

    public String getMuestras() {
        return muestras;
    }

    public void setMuestras(String muestras) {
        this.muestras = muestras;
    }

    public String getNoper1() {
        return noper1;
    }

    public void setNoper1(String noper1) {
        this.noper1 = noper1;
    }

    public String getHorini1() {
        return horini1;
    }

    public void setHorini1(String horini1) {
        this.horini1 = horini1;
    }

    public String getHorfin1() {
        return horfin1;
    }

    public void setHorfin1(String horfin1) {
        this.horfin1 = horfin1;
    }

    public boolean isValue18() {
        return Value18;
    }

    public void setValue18(boolean value18) {
        Value18 = value18;
    }

    public boolean isValue19() {
        return Value19;
    }

    public void setValue19(boolean value19) {
        Value19 = value19;
    }

    public boolean isValue20() {
        return Value20;
    }

    public void setValue20(boolean value20) {
        Value20 = value20;
    }

    public boolean isValue21() {
        return Value21;
    }

    public void setValue21(boolean value21) {
        Value21 = value21;
    }

    public boolean isValue22() {
        return Value22;
    }

    public void setValue22(boolean value22) {
        Value22 = value22;
    }

    public boolean isValue23() {
        return Value23;
    }

    public void setValue23(boolean value23) {
        Value23 = value23;
    }

    public boolean isValue24() {
        return Value24;
    }

    public void setValue24(boolean value24) {
        Value24 = value24;
    }

    public boolean isValue25() {
        return Value25;
    }

    public void setValue25(boolean value25) {
        Value25 = value25;
    }

    public boolean isValue26() {
        return Value26;
    }

    public void setValue26(boolean value26) {
        Value26 = value26;
    }

    public String getFechaini1() {
        return fechaini1;
    }

    public void setFechaini1(String fechaini1) {
        this.fechaini1 = fechaini1;
    }

    public String getEmitido() {
        return emitido;
    }

    public void setEmitido(String emitido) {
        this.emitido = emitido;
    }

    public String getHoraini1() {
        return horaini1;
    }

    public void setHoraini1(String horaini1) {
        this.horaini1 = horaini1;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getFechafini2() {
        return fechafini2;
    }

    public void setFechafini2(String fechafini2) {
        this.fechafini2 = fechafini2;
    }

    public String getHorafini2() {
        return horafini2;
    }

    public void setHorafini2(String horafini2) {
        this.horafini2 = horafini2;
    }

    public String getRealizpor() {
        return realizpor;
    }

    public void setRealizpor(String realizpor) {
        this.realizpor = realizpor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVeripor() {
        return veripor;
    }

    public void setVeripor(String veripor) {
        this.veripor = veripor;
    }

    public String getObser() {
        return Obser;
    }

    public void setObser(String obser) {
        Obser = obser;
    }

    public String getFechaAna() {
        return FechaAna;
    }

    public void setFechaAna(String fechaAna) {
        FechaAna = fechaAna;
    }

    public String getCanti() {
        return Canti;
    }

    public void setCanti(String canti) {
        Canti = canti;
    }

    public String getEspeolor() {
        return espeolor;
    }

    public void setEspeolor(String espeolor) {
        this.espeolor = espeolor;
    }

    public String getEspecolor() {
        return especolor;
    }

    public void setEspecolor(String especolor) {
        this.especolor = especolor;
    }

    public String getEspedensi() {
        return espedensi;
    }

    public void setEspedensi(String espedensi) {
        this.espedensi = espedensi;
    }

    public String getEspeph() {
        return espeph;
    }

    public void setEspeph(String espeph) {
        this.espeph = espeph;
    }

    public String getMetoolor() {
        return metoolor;
    }

    public void setMetoolor(String metoolor) {
        this.metoolor = metoolor;
    }

    public String getMetocolor() {
        return metocolor;
    }

    public void setMetocolor(String metocolor) {
        this.metocolor = metocolor;
    }

    public String getMetodensi() {
        return metodensi;
    }

    public void setMetodensi(String metodensi) {
        this.metodensi = metodensi;
    }

    public String getMetoph() {
        return metoph;
    }

    public void setMetoph(String metoph) {
        this.metoph = metoph;
    }

    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAnalisadoPor() {
        return AnalisadoPor;
    }

    public void setAnalisadoPor(String analisadoPor) {
        AnalisadoPor = analisadoPor;
    }

    public String getObser1() {
        return Obser1;
    }

    public void setObser1(String obser1) {
        Obser1 = obser1;
    }

    public String getTeoWater() {
        return teoWater;
    }

    public void setTeoWater(String teoWater) {
        this.teoWater = teoWater;
    }

    public String getTeoGlutar() {
        return teoGlutar;
    }

    public void setTeoGlutar(String teoGlutar) {
        this.teoGlutar = teoGlutar;
    }

    public String getTeoPropile() {
        return teoPropile;
    }

    public void setTeoPropile(String teoPropile) {
        this.teoPropile = teoPropile;
    }

    public String getTeoBrisam() {
        return teoBrisam;
    }

    public void setTeoBrisam(String teoBrisam) {
        this.teoBrisam = teoBrisam;
    }

    public String getTeoFosfato() {
        return teoFosfato;
    }

    public void setTeoFosfato(String teoFosfato) {
        this.teoFosfato = teoFosfato;
    }

    public String getTeoGreen() {
        return teoGreen;
    }

    public void setTeoGreen(String teoGreen) {
        this.teoGreen = teoGreen;
    }

    public String getCantiReal() {
        return cantiReal;
    }

    public void setCantiReal(String cantiReal) {
        this.cantiReal = cantiReal;
    }

    public String getCantiFalta() {
        return cantiFalta;
    }

    public void setCantiFalta(String cantiFalta) {
        this.cantiFalta = cantiFalta;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHorFini() {
        return horFini;
    }

    public void setHorFini(String horFini) {
        this.horFini = horFini;
    }

    public String getDiaAco() {
        return diaAco;
    }

    public void setDiaAco(String diaAco) {
        this.diaAco = diaAco;
    }

    public String getRevisado() {
        return Revisado;
    }

    public void setRevisado(String revisado) {
        Revisado = revisado;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public boolean isValue() {
        return Value;
    }

    public void setValue(boolean value) {
        Value = value;
    }

    public boolean isValue1() {
        return Value1;
    }

    public void setValue1(boolean value1) {
        Value1 = value1;
    }

    public boolean isValue2() {
        return Value2;
    }

    public void setValue2(boolean value2) {
        Value2 = value2;
    }

    public boolean isValue3() {
        return Value3;
    }

    public void setValue3(boolean value3) {
        Value3 = value3;
    }

    public boolean isValue4() {
        return Value4;
    }

    public void setValue4(boolean value4) {
        Value4 = value4;
    }

    public boolean isValue5() {
        return Value5;
    }

    public void setValue5(boolean value5) {
        Value5 = value5;
    }

    public boolean isValue6() {
        return Value6;
    }

    public void setValue6(boolean value6) {
        Value6 = value6;
    }

    public boolean isValue7() {
        return Value7;
    }

    public void setValue7(boolean value7) {
        Value7 = value7;
    }

    public boolean isValue8() {
        return Value8;
    }

    public void setValue8(boolean value8) {
        Value8 = value8;
    }

    public String getPesadoPor() {
        return PesadoPor;
    }

    public void setPesadoPor(String pesadoPor) {
        PesadoPor = pesadoPor;
    }

    public String getVerificadoPor() {
        return VerificadoPor;
    }

    public void setVerificadoPor(String verificadoPor) {
        VerificadoPor = verificadoPor;
    }

    public String getRealizadoPor() {
        return RealizadoPor;
    }

    public void setRealizadoPor(String realizadoPor) {
        RealizadoPor = realizadoPor;
    }

    public boolean isValue9() {
        return Value9;
    }

    public void setValue9(boolean value9) {
        Value9 = value9;
    }

    public boolean isValue10() {
        return Value10;
    }

    public void setValue10(boolean value10) {
        Value10 = value10;
    }

    public boolean isValue11() {
        return Value11;
    }

    public void setValue11(boolean value11) {
        Value11 = value11;
    }

    public boolean isValue12() {
        return Value12;
    }

    public void setValue12(boolean value12) {
        Value12 = value12;
    }

    public boolean isValue13() {
        return Value13;
    }

    public void setValue13(boolean value13) {
        Value13 = value13;
    }

    public boolean isValue14() {
        return Value14;
    }

    public void setValue14(boolean value14) {
        Value14 = value14;
    }

    public boolean isValue15() {
        return Value15;
    }

    public void setValue15(boolean value15) {
        Value15 = value15;
    }

    public boolean isValue16() {
        return Value16;
    }

    public void setValue16(boolean value16) {
        Value16 = value16;
    }

    public boolean isValue17() {
        return Value17;
    }

    public void setValue17(boolean value17) {
        Value17 = value17;
    }

    public String getConwater() {
        return conwater;
    }

    public void setConwater(String conwater) {
        this.conwater = conwater;
    }

    public String getConglutar() {
        return conglutar;
    }

    public void setConglutar(String conglutar) {
        this.conglutar = conglutar;
    }

    public String getConpropile() {
        return conpropile;
    }

    public void setConpropile(String conpropile) {
        this.conpropile = conpropile;
    }

    public String getConbrisam() {
        return conbrisam;
    }

    public void setConbrisam(String conbrisam) {
        this.conbrisam = conbrisam;
    }

    public String getConfosfato() {
        return confosfato;
    }

    public void setConfosfato(String confosfato) {
        this.confosfato = confosfato;
    }

    public String getCongreen() {
        return congreen;
    }

    public void setCongreen(String congreen) {
        this.congreen = congreen;
    }

    public String getLotewater() {
        return lotewater;
    }

    public void setLotewater(String lotewater) {
        this.lotewater = lotewater;
    }

    public String getLoteglutar() {
        return loteglutar;
    }

    public void setLoteglutar(String loteglutar) {
        this.loteglutar = loteglutar;
    }

    public String getLotepropile() {
        return lotepropile;
    }

    public void setLotepropile(String lotepropile) {
        this.lotepropile = lotepropile;
    }

    public String getLotebrisam() {
        return lotebrisam;
    }

    public void setLotebrisam(String lotebrisam) {
        this.lotebrisam = lotebrisam;
    }

    public String getLotefosfato() {
        return lotefosfato;
    }

    public void setLotefosfato(String lotefosfato) {
        this.lotefosfato = lotefosfato;
    }

    public String getLotegreen() {
        return lotegreen;
    }

    public void setLotegreen(String lotegreen) {
        this.lotegreen = lotegreen;
    }

    public String getAnaWater() {
        return anaWater;
    }

    public void setAnaWater(String anaWater) {
        this.anaWater = anaWater;
    }

    public String getAnaGlutar() {
        return anaGlutar;
    }

    public void setAnaGlutar(String anaGlutar) {
        this.anaGlutar = anaGlutar;
    }

    public String getAnaPropile() {
        return anaPropile;
    }

    public void setAnaPropile(String anaPropile) {
        this.anaPropile = anaPropile;
    }

    public String getAnaBrisam() {
        return anaBrisam;
    }

    public void setAnaBrisam(String anaBrisam) {
        this.anaBrisam = anaBrisam;
    }

    public String getAnaFosfato() {
        return anaFosfato;
    }

    public void setAnaFosfato(String anaFosfato) {
        this.anaFosfato = anaFosfato;
    }

    public String getAnaGreen() {
        return anaGreen;
    }

    public void setAnaGreen(String anaGreen) {
        this.anaGreen = anaGreen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWater() {
        return Water;
    }

    public void setWater(String water) {
        Water = water;
    }

    public String getGlutar() {
        return Glutar;
    }

    public void setGlutar(String glutar) {
        Glutar = glutar;
    }

    public String getPropile() {
        return Propile;
    }

    public void setPropile(String propile) {
        Propile = propile;
    }

    public String getBrisam() {
        return Brisam;
    }

    public void setBrisam(String brisam) {
        Brisam = brisam;
    }

    public String getFosfato() {
        return Fosfato;
    }

    public void setFosfato(String fosfato) {
        Fosfato = fosfato;
    }

    public String getGreen() {
        return Green;
    }

    public void setGreen(String green) {
        Green = green;
    }
}



