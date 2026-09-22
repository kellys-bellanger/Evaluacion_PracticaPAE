package ni.edu.uam.evaluacion.modelo;

import java.time.LocalDate;

public class Solicitud {
    // Los 6 campos obligatorios solicitados en el Caso #6
    private String numero;
    private String cliente;
    private LocalDate fecha;
    private String tipo;
    private String descripcion;
    private String estado;

    // Constructor completo para instanciar la solicitud desde el formulario
    public Solicitud(String numero, String cliente, LocalDate fecha, String tipo, String descripcion, String estado) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters obligatorios para que PropertyValueFactory pueda leer los datos en la tabla
    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
}