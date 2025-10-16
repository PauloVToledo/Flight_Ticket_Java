package app.flight_ticket_app.model;

public class Ticket {
    private String nombreCompleto;
    private String numeroAsiento;
    private String claseBoleto;
    private String aerolinea;
    private String fechaHoraVuelo;
    private String puntoOrigen;
    private String puntoDestino;
    private String identificadorBoleto;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getClaseBoleto() {
        return claseBoleto;
    }

    public void setClaseBoleto(String claseBoleto) {
        this.claseBoleto = claseBoleto;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getFechaHoraVuelo() {
        return fechaHoraVuelo;
    }

    public void setFechaHoraVuelo(String fechaHoraVuelo) {
        this.fechaHoraVuelo = fechaHoraVuelo;
    }

    public String getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(String puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public String getPuntoDestino() {
        return puntoDestino;
    }

    public void setPuntoDestino(String puntoDestino) {
        this.puntoDestino = puntoDestino;
    }

    public String getIdentificadorBoleto() {
        return identificadorBoleto;
    }

    public void setIdentificadorBoleto(String identificadorBoleto) {
        this.identificadorBoleto = identificadorBoleto;
    }
}