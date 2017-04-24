package ua.kpi.tef.controller;
import ua.kpi.tef.view.*;
import ua.kpi.tef.model.*;

import java.util.Scanner;

/**
 * Created by Zigzagger on 04.04.2017.
 */
public class Controller {
    // processUser
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }



    public void processUser(){
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook();
        inputNoteNoteBook.inputUserInfo();
    }



}
