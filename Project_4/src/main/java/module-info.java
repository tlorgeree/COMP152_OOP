module com.p4.project_4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.p4.project_4 to javafx.fxml;
    exports com.p4.project_4;
}