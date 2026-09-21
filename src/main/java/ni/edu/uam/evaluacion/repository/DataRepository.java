package evaluacion.repository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sistema.model.Solicitud;

public class DataRepository {
    // Lista reactiva global en memoria RAM
    private static final ObservableList<Solicitud> solicitudes = FXCollections.observableArrayList();

    // Método de acceso público para que Registro pueda hacer .add() y Consulta pueda hacer .setItems()
    public static ObservableList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
}