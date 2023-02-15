package com.example.todolist;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class HelloController {
    public TextField task;
    public TreeView allTheTasks;
    public Label statusLabel;
    TreeItem rootItem;
    TreeItem MondayWebItem;
    TreeItem TuesdayWebItem;
    TreeItem WednesdayWebItem;
    TreeItem ThursdayWebItem;
    TreeItem FridayWebItem;
    public void initialize() {
        rootItem = new TreeItem("Tasks for the week");

        MondayWebItem = new TreeItem("Monday");
        rootItem.getChildren().add(MondayWebItem);

        TuesdayWebItem = new TreeItem("Tuesday");
        rootItem.getChildren().add(TuesdayWebItem);

        WednesdayWebItem = new TreeItem("Wednesday");
        rootItem.getChildren().add(WednesdayWebItem);

        ThursdayWebItem = new TreeItem("Thursday");
        rootItem.getChildren().add(ThursdayWebItem);

        FridayWebItem = new TreeItem("Friday");
        rootItem.getChildren().add(FridayWebItem);

        allTheTasks.setRoot(rootItem);
        allTheTasks.setShowRoot(true);

    }

    public void typeATask() {
        TreeItem selectedTreeItem = (TreeItem)allTheTasks.getSelectionModel().getSelectedItems().get(0);
        String selectedTreeItemText = selectedTreeItem.getValue().toString();
        System.out.println(selectedTreeItemText);

        if (selectedTreeItemText.equalsIgnoreCase("Monday")) {
            TreeItem mondaysItem = new TreeItem(task.getText());
            MondayWebItem.getChildren().add(mondaysItem);
            statusLabel.setText("Added " + task.getText() + " to " + selectedTreeItemText);
        } else if (selectedTreeItemText.equalsIgnoreCase("Tasks for the week")) {
            MondayWebItem.getChildren().add(new TreeItem(task.getText()));
            TuesdayWebItem.getChildren().add(new TreeItem(task.getText()));
            WednesdayWebItem.getChildren().add(new TreeItem(task.getText()));
            ThursdayWebItem.getChildren().add(new TreeItem(task.getText()));
            FridayWebItem.getChildren().add(new TreeItem(task.getText()));
            statusLabel.setText("Added " + task.getText() + " to all days' list");
        } else {
            statusLabel.setText("Error: no day selected");
        }
        if (selectedTreeItemText.equalsIgnoreCase("Tuesday")) {
            TreeItem tuesdaysItem = new TreeItem(task.getText());
            TuesdayWebItem.getChildren().add(tuesdaysItem);
            statusLabel.setText("Added " + task.getText() + " to " + selectedTreeItemText);
        }
        if (selectedTreeItemText.equalsIgnoreCase("Wednesday")) {
            TreeItem wednesdaysItem = new TreeItem(task.getText());
            WednesdayWebItem.getChildren().add(wednesdaysItem);
            statusLabel.setText("Added " + task.getText() + " to " + selectedTreeItemText);
        }
        if (selectedTreeItemText.equalsIgnoreCase("Thursday")) {
            TreeItem thursdaysItem = new TreeItem(task.getText());
            ThursdayWebItem.getChildren().add(thursdaysItem);
            statusLabel.setText("Added " + task.getText() + " to " + selectedTreeItemText);
        }
        if (selectedTreeItemText.equalsIgnoreCase("Friday")) {
            TreeItem fridaysItem = new TreeItem(task.getText());
            FridayWebItem.getChildren().add(fridaysItem);
            statusLabel.setText("Added " + task.getText() + " to " + selectedTreeItemText);
        }
    }
    public void deleteATask(){

    }
}