package com.mycompany.sevenfilosofers;

import Componentes.VentanaTabla;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
VentanaTabla ventana = new VentanaTabla(); //@TODO Cambiar esto por tabla, y la tabla contenga la ventana

    @FXML
    private void switchToSecondary() throws IOException {
       ventana.setVisible(true);
       ventana.UpdateValues();
        App.setRoot("secondary");
    }
}
