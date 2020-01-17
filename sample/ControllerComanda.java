package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.reflect.Array;
import java.util.List;
import java.util.*;

public class ControllerComanda {

        @FXML
        private TableColumn colunaGarcom = new TableColumn<>("Garcom");

        @FXML
        private TableColumn colunaValor = new TableColumn<>("Valor");

        @FXML
        private TextField textFieldDesconto;

        @FXML
        private TableColumn colunaPedido = new TableColumn<>("Pedido");

        @FXML
        private TableView tabelaComanda = new TableView<>();

        @FXML
        private Button botaoFinalizarPedido;

        @FXML
        private TextField textFieldTotal;

        @FXML
        private Button botaoAplicarDesconto;

        @FXML
        private Button botaoLiberarMesa;;

        @FXML
        public void initialize(){
                List pessoas = Arrays.asList(
                        new Pessoa("Merciana",18, "blablabla"),
                        new Pessoa("Juliane",25, "dygvufubvufg"),
                        new Pessoa("Pedro",30, "40228922")
                );
                colunaGarcom.setCellFactory(new PropertyValueFactory<>("nome"));
                colunaPedido.setCellFactory(new PropertyValueFactory<>("contato"));
                colunaValor.setCellFactory(new PropertyValueFactory<>("idade"));
                tabelaComanda.setItems(FXCollections.observableArrayList(pessoas));
        }

}
