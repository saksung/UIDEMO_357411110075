package sample;

import dbUtil.dbconnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import jdk.Exported;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Controller implements Initializable {

    public Controller();
    private  loginModel()
    {this.connection= dbconnection.getSQCONN();
if (this.loginmodel .isDataseConnection ()){
@FXML
        private Label dbStatus;
    @FXML
            private TextField username;
    @FXML
            private PasswordField password;
    @FXML
            private Label loginStus;


}//loginModel
        @FXML
                public void Login (ActiveEvent){
    try
    }
    if (this.loginmodel.isLogin(this.username.getText(),this.password.getText())){
                    stage stage = this.btnLogin.getScene().getwindow();
                    admindashBoard();

    }else {
        loginStatus.setText("your username or password is ")
    }
        public boolean isDatabaseConnection(){
    return this.connetion ! = null;

    }//isDatabaseConnection
    public boolean isLogin (String user ,String pass ){
        PreparedStatement pr =null;
        ResultSet rs = null;
        String sql =("sesct * from user where username = ? and password")ว

    }
    pr =this.conn
    }
    private void admindashBoard(){
        JOptionPane.showMessageDialog(parentComponent:null,message:"Welc");
    }
}//class
