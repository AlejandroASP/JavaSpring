package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias.model;

import jakarta.validation.constraints.*;

public class Farmacia {
    @NotBlank(message = "El campo WEB no puede estar vacío")
    @Email(message = "El campo WEB debe ser un correo electrónico válido")
    private String WEB;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String LUNES;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String MARTES;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String MIERCOLES;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String JUEVES;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String VIERNES;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String SABADO;
    @NotBlank(message = "El campo WEB no puede estar vacío")
    private  String DOMINGO;
    @NotBlank(message = "El campo TELEFONO no puede estar vacío")
    private String TELEFONO;
    @Size(min = 5, max = 30, message = "El campo LUNES debe tener exactamente 3 caracteres")
    private String NOMBRE;
    @NotNull(message = "El campo UTM_Y no puede ser nulo")
    private float UTM_X;
    @NotNull(message = "El campo UTM_Y no puede ser nulo")
    private float UTM_Y;
    public Farmacia() {
    }
    public Farmacia(String WEB, String LUNES, String MARTES, String MIERCOLES, String JUEVES, String VIERNES, String SABADO, String DOMINGO, String TELEFONO, String NOMBRE, float UTM_X, float UTM_Y) {
        this.WEB = WEB;
        this.LUNES = LUNES;
        this.MARTES = MARTES;
        this.MIERCOLES = MIERCOLES;
        this.JUEVES = JUEVES;
        this.VIERNES = VIERNES;
        this.SABADO = SABADO;
        this.DOMINGO = DOMINGO;
        this.TELEFONO = TELEFONO;
        this.NOMBRE = NOMBRE;
        this.UTM_X = UTM_X;
        this.UTM_Y = UTM_Y;
    }

    public String getWEB() {
        return WEB;
    }

    public void setWEB(String WEB) {
        this.WEB = WEB;
    }

    public String getLUNES() {
        return LUNES;
    }

    public void setLUNES(String LUNES) {
        this.LUNES = LUNES;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public float getUTM_X() {
        return UTM_X;
    }

    public void setUTM_X(float UTM_X) {
        this.UTM_X = UTM_X;
    }

    public float getUTM_Y() {
        return UTM_Y;
    }

    public void setUTM_Y(float UTM_Y) {
        this.UTM_Y = UTM_Y;
    }

    public String getMARTES() {
        return MARTES;
    }

    public void setMARTES(String MARTES) {
        this.MARTES = MARTES;
    }

    public String getMIERCOLES() {
        return MIERCOLES;
    }

    public void setMIERCOLES(String MIERCOLES) {
        this.MIERCOLES = MIERCOLES;
    }

    public String getJUEVES() {
        return JUEVES;
    }

    public void setJUEVES(String JUEVES) {
        this.JUEVES = JUEVES;
    }

    public String getVIERNES() {
        return VIERNES;
    }

    public void setVIERNES(String VIERNES) {
        this.VIERNES = VIERNES;
    }

    public String getSABADO() {
        return SABADO;
    }

    public void setSABADO(String SABADO) {
        this.SABADO = SABADO;
    }

    public String getDOMINGO() {
        return DOMINGO;
    }

    public void setDOMINGO(String DOMINGO) {
        this.DOMINGO = DOMINGO;
    }
}
