package controller;

import model.AppModel;
import view.AppView;

import java.util.ArrayList;
import java.util.List;

public final class AppController {
    private AppModel model;
    private AppView view;

    public AppController() {
        this.model = new AppModel();
        this.view = new AppView();
    }

    public void start() {
        view.showLogo();
        List<String> lst = new ArrayList<>();
        lst.add(this.model.toString());
        view.show(lst);
    }
}
