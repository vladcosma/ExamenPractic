package UI;

import.Domain.Car;
import Service.CarService;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CarAddController {
    public TextField txtId;
    public TextField txtModel;
    public TextField txtKilometraj;
    public TextField txtBilledPrice;
    public Button btnAdd;
    public Button btnCancel;
    public Spinner spnId;

    private CarService carService;

    public void setService(CarService carService) {
        this.carService = carService;
    }

    public void btnCancelClick(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    public void btnAddClick(ActionEvent actionEvent) {

        try {
            String id = String.valueOf(spnId.getValue());
            String model = txtModel.getModel();
            String kilometraj = txtKilometraj.getKilometraj();
            double billedprice = Double.parseDouble(txtBilledPrice.getText());


            carService.addOrUpdate(id, model, kilometraj, billedprice);

            btnCancelClick(actionEvent);
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }
}
