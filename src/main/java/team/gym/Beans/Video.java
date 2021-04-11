package team.gym.Beans;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Video {
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty type = new SimpleStringProperty();
    private final StringProperty intro = new SimpleStringProperty();
    private final StringProperty trainer = new SimpleStringProperty();
    private final String url = "";

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getIntro() {
        return intro.get();
    }

    public StringProperty introProperty() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro.set(intro);
    }

    public String getTrainer() {
        return trainer.get();
    }

    public StringProperty trainerProperty() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer.set(trainer);
    }

    public String getUrl() { return url; }
}

