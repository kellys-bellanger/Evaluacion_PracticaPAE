package evaluacion.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sistema.application.MainApp;
import sistema.model.Solicitud;
import sistema.repository.DataRepository;

public class RegistroController {
    @FXML private TextField txtNumero, txtCliente, txtDescripcion;
    @FXML private DatePicker dpFecha;
    @FXML private ComboBox<String> cmbTipo, cmbEstado;

    @FXML
    public void initialize() {
        cmbTipo.getItems().addAll("Mantenimiento", "Soporte", "Instalación");
        cmbEstado.getItems().addAll("Pendiente", "En Proceso", "Completado");
    }

    @FXML
    public void guardar(ActionEvent event) {
        Solicitud nueva = new Solicitud(
                txtNumero.getText(), txtCliente.getText(), dpFecha.getValue(),
                cmbTipo.getValue(), txtDescripcion.getText(), cmbEstado.getValue()
        );
        DataRepository.getSolicitudes().add(nueva);
        volver(event);
    }

    @FXML
    public void volver(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        MainApp.cambiarVentana(stage, "/sistema/view/menu.fxml", "Menú Principal");
    }
}