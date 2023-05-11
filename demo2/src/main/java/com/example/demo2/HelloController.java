package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class HelloController {
    @FXML
    private Button myButton;

    public Button getMyButton() {
        return myButton;
    }

    private Stage stage;
    private Label myname;

    public void setStage(Stage stage) {
        this.stage = stage;
    }


    @FXML
    protected void onStartButtonClick(ActionEvent event) throws IOException {
        // Créer une nouvelle scène à partir d'un fichier FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("begin.fxml"));
        Parent root = loader.load();
        Scene newScene = new Scene(root);

        // Obtenir la scène actuelle à partir du bouton
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        // Afficher la nouvelle scène dans la même fenêtre
        stage.setScene(newScene);
        stage.show();
    }
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButtonOk;
    String name;
    @FXML
    protected void onMyOkButtonClick(ActionEvent event) throws IOException {
        try {
            name = myTextField.getText().trim();
            Integer.parseInt(name);
            myLabel.setText("Entry a validate name (not a number). ");
        } catch (NumberFormatException e){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Wand.fxml"));
            Parent root = loader.load();
            Scene Scene3 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene3);
            stage.show();
        }

    }
    @FXML
    private CheckBox core1;
    @FXML
    private CheckBox core2;
    @FXML
    private TextField size;
    @FXML
    private Label labelWand;
    private String Wand;
    private String wandSize;
    private int wandS;
    @FXML
    protected void onWandButtonClick(ActionEvent event) throws IOException {
            boolean emptycore = true;
            boolean emptysize = true;
            boolean choose1 = core1.isSelected();
            boolean choose2 = core2.isSelected();

            if (choose1 == true && choose2 == true){
                labelWand.setText("Choose One Core");
                emptycore = true;
            } else if (choose1 == true && choose2 == false) {
                emptycore = false;
                Wand="Phoenix Feather";
            } else if (choose1 == false && choose2 == true) {
                emptycore = false;
                Wand="Dragon Heartstring";
            } else {
                emptycore = true;
                labelWand.setText("Choose a Core");
            }

            wandSize = size.getText();
            if (wandSize.trim().isEmpty()) {
                // Afficher un message d'erreur
                labelWand.setText("Entry a baguette size");
                return;
            } else{
                    try {
                    wandS = Integer.parseInt((wandSize));
                        emptysize = false;
                }catch(NumberFormatException e){
                        labelWand.setText("Entry a number for your baguette size");
                        emptysize = true;
                }
            }
            if (!emptycore && !emptysize){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sortingHat.fxml"));
                Parent root = loader.load();
                Scene Scene3 = new Scene(root);
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.setScene(Scene3);
                stage.show();
            }
    }
    @FXML
    private RadioButton A1,B1,C1,D1,A2,B2,C2,D2,A3,B3,C3,D3;
    @FXML
    private Button ButtonHat;
    @FXML
    private Label labelHat;
    private String House;
    private boolean response=false;
    private int countA=0;
    private int countB=0;
    private int countC=0;
    private int countD=0;
    @FXML
    protected void onHouseButtonClick(ActionEvent event) throws IOException{
        //Q1
        if (A1.isSelected() && B1.isSelected() && C1.isSelected() && D1.isSelected() || A2.isSelected() && B2.isSelected() && C2.isSelected() && D2.isSelected() || A3.isSelected() && B3.isSelected() && C3.isSelected() && D3.isSelected()){
            labelHat.setText("Choose one option");
            return;
        } else if (A1.isSelected()) {
            countA++;
        } else if (B1.isSelected()) {
            countB++;
        } else if (C1.isSelected()) {
            countC++;
        } else if (D1.isSelected()) {
            countD++;
        } else {
            labelHat.setText("Is empty, choose one option for question 1");
            return;
        }
        //Q2
        if (A2.isSelected()) {
            countA++;
        } else if (B2.isSelected()) {
            countB++;
        } else if (C2.isSelected()) {
            countC++;
        } else if (D2.isSelected()) {
            countD++;
        } else {
            labelHat.setText("Is empty, choose one option for question 2");
            return;
        }

        //Q3
        if (A3.isSelected()) {
            countA++;
        } else if (B3.isSelected()) {
            countB++;
        } else if (C3.isSelected()) {
            countC++;
        } else if (D3.isSelected()) {
            countD++;
        } else {
            labelHat.setText("Is empty, choose one option for question 3");
            return;
        }

        if (countA > countB && countA > countC && countA > countD) {
            response=true;
            House = "Ravenclaw";
            labelHat.setText("You belong to " + House + " House");
        } else if (countB > countA && countB > countC && countB > countD) {
            response=true;
            House = "Slytherin";
            labelHat.setText("You belong to " + House + " House");

        } else if (countC > countA && countC > countB && countC > countD) {
            response=true;
            House = "Gryffindor";
            labelHat.setText("You belong to " + House + " House");
        } else {
            response=true;
            House = "Hufflepuff";
            labelHat.setText("You belong to " + House + " House");
        }

    }

    @FXML
    protected void onNextSceneButtonClick(ActionEvent event) throws IOException {
        if(A1.isSelected() && B1.isSelected() && C1.isSelected() && D1.isSelected() || A2.isSelected() && B2.isSelected() && C2.isSelected() && D2.isSelected() || A3.isSelected() && B3.isSelected() && C3.isSelected() && D3.isSelected()){
            labelHat.setText("Choose one option");
            return;
        } else if (response==true) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pet.fxml"));
            Parent root = loader.load();
            Scene Scene4 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene4);
            stage.show();
        }
    }
    @FXML
    private CheckBox pet1, pet2, pet3, pet4;
    @FXML
    private Label labelPet;
    private String pet;
    @FXML
    protected void onPetButtonClick(ActionEvent event) throws IOException {
        if (pet1.isSelected() && pet2.isSelected() && pet3.isSelected() && pet4.isSelected()) {
            labelPet.setText("Choose one option");
            return;
        } else if (pet1.isSelected()) {
            pet = "Cat";
            FXMLLoader loader = new FXMLLoader(getClass().getResource("combat1.fxml"));
            Parent root = loader.load();
            Scene Scene5 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene5);
            stage.show();
        } else if (pet2.isSelected()) {
            pet="Owl";
            FXMLLoader loader = new FXMLLoader(getClass().getResource("combat1.fxml"));
            Parent root = loader.load();
            Scene Scene5 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene5);
            stage.show();
        } else if (pet3.isSelected()) {
            pet="Cat";
            FXMLLoader loader = new FXMLLoader(getClass().getResource("combat1.fxml"));
            Parent root = loader.load();
            Scene Scene5 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene5);
            stage.show();
        } else if (pet4.isSelected()) {
            pet="Toad";
            FXMLLoader loader = new FXMLLoader(getClass().getResource("combat1.fxml"));
            Parent root = loader.load();
            Scene Scene5 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene5);
            stage.show();
        } else {
            labelPet.setText("Is empty, choose one option");
            return;
        }
    }
    @FXML
    private Button spell;
    @FXML
    private Button potion;
    @FXML
    private Button specialSpell;
    @FXML
    private Label labelRound;
    @FXML
    private Label labelPrecision;
    @FXML
    private Label hpWizzard;
    @FXML
    private Label xpWizzard;
    @FXML
    private Label hpEnnemy;

    private Wizzard wizzard;
    private Enemy troll;
    private int round;

    public void initialize(ActionEvent event) throws IOException {
        wizzard = new Wizzard(100, 10, name,pet,House,Wand,wandS);
        troll = new Enemy("Troll", 100, 50);
        round = 0;

        updateLabels();
        combat();
        if (!Wizzard.Alive()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gameover.fxml"));
            Parent root = loader.load();
            Scene Scene6 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene6);
            stage.show();
        } else if (Wizzard.Alive()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("win.fxml"));
            Parent root = loader.load();
            Scene Scene7 = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(Scene7);
            stage.show();
        }
    }

    private void combat(){
        Enemy Troll = new Enemy("Troll", 100, 50);
        int round = 0;
        do {
            round = round + 1;
            labelRound.setText("ROUND" + round);
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            if (precisionWizzard > precisionEnemy) {
                labelPrecision.setText("You got your attack !! : " + precisionWizzard + "%");
                labelPrecision.setText(Wizzard.getName() + " What do you want to use (choose button) ?");


            } else if (precisionEnemy > precisionWizzard) {
                labelPrecision.setText("It's the tour of your Enemy...");
                troll.attack();
                wizzard.setMaxhp(wizzard.getMaxhp());
                updateLabels();
            } else {
                labelPrecision.setText("Your Enemy have an advantage");
                Enemy.attack();
                Wizzard.setMaxhp(Wizzard.getMaxhp());
                updateLabels();
            }

        } while (Troll.Alive() && Wizzard.Alive());

    }

    private void updateLabels() {
        hpWizzard.setText("Hp: " + wizzard.getMaxhp() + " %");
        xpWizzard.setText("Xp: " + wizzard.getXp());
        hpEnnemy.setText("Hp Enemy: " + troll.getMaxhp() + " %");
    }

    @FXML
    private void onSpellButtonClick() {
        troll.WingardiumLeviosa();
        updateLabels();
        // Handle spell button click
    }

    @FXML
    private void onPotionButtonClick() {
        wizzard.potion(10);
        updateLabels();
        // Handle potion button click
    }

    @FXML
    private void onSpecialButtonClick() {
        troll.spell(10);
        updateLabels();
        // Handle special spell button click
    }
}