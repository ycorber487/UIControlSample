module es.ieslosmontecillos.uicontrolsample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;
    requires javafx.graphics;

    opens es.ieslosmontecillos.uicontrolsample to javafx.fxml;
    exports es.ieslosmontecillos.uicontrolsample.tooltipsample;
    exports es.ieslosmontecillos.uicontrolsample.checkboxsample;
    exports es.ieslosmontecillos.uicontrolsample.tableviewsample;

}