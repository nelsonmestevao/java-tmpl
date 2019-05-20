package controller;

import model.AppModel;
import view.AppView;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private AppModel model;
    private AppView view;

    public AppController() {
        this.model = new AppModel(42);
        this.view = new AppView();
    }

    public void run() {
        view.showLogo();
        List<String> lst = new ArrayList<>();
        lst.add(this.model.toString());
        view.show(lst);
    }
}
