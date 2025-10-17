package app.flight_ticket_app.model;

import jakarta.persistence.Entity; // Importante: usar jakarta.persistence para Spring Boot 3+
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // <--- Indica que esta clase es una entidad JPA (una tabla en la DB)
public class Ticket {

    @Id // <--- Marca el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <--- Configura la auto-generación del ID por la DB
    private Long id; // El ID es necesario para JPA

    private String nombreCompleto;
    private String numeroAsiento;
    private String claseBoleto;
    private String aerolinea;
    private String fechaHoraVuelo;
    private String puntoOrigen;
    private String puntoDestino;
    private String identificadorBoleto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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