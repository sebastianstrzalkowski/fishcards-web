package pl.sebastianstrzalkowski.fishcards.view;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Spliterator;
import java.util.function.Consumer;

@SpringUI(path = "")
public class MainView extends UI {

    public VerticalLayout mainLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setMainLayout();
        setHeader();
        setForm();
        setButtons();

    }

    public void setMainLayout(){
        mainLayout = new VerticalLayout();
        mainLayout.setWidth("100%");
        mainLayout.setMargin(true);
        mainLayout.setSpacing(true);
        mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        setContent(mainLayout);
    }

    public void setHeader(){
        HorizontalLayout headerLayout = new HorizontalLayout();
        headerLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        Label title = new Label("Fiszki");
        title.addStyleName(ValoTheme.LABEL_H1);
        title.addStyleName(ValoTheme.LABEL_LIGHT);
        title.addStyleName(ValoTheme.LABEL_BOLD);

        headerLayout.addComponents(title);
        mainLayout.addComponent(headerLayout);
    }

    public void setForm(){
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setMargin(true);
        formLayout.setSpacing(true);

        TextField wordTextField = new TextField();
        wordTextField.setValue("Tutaj wpisz słowo");
        wordTextField.setWidth("80%");
        Label commentaryLabel = new Label("Tutaj pojawi się znaczenie");

        formLayout.addComponents(wordTextField,commentaryLabel);
        mainLayout.addComponent(formLayout);
    }

    public void setButtons(){
        HorizontalLayout buttonsLayout = new HorizontalLayout();
        buttonsLayout.setMargin(true);
        buttonsLayout.setSpacing(true);

        Button check = new Button("Sprawdź");
        Button next = new Button("Następna");
        Button iCan = new Button("Umiem");

        buttonsLayout.addComponents(check,next,iCan);
        mainLayout.addComponent(buttonsLayout);
    }
}
