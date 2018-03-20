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
}
