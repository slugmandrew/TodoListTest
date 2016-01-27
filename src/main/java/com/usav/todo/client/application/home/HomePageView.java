package com.usav.todo.client.application.home;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.usav.todo.client.widget.Item;
import com.vaadin.polymer.paper.widget.*;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView
{
    public interface Binder extends UiBinder<Widget, HomePageView>
    {
    }

//    @UiField
//    PaperIconItem menuClearAll, menuClearDone, menuSettings, menuAbout;
//
//    @UiField
//    PaperDrawerPanel drawerPanel;
//
//    @UiField
//    HTMLPanel content;
//
//    @UiField
//    PaperDialog addItemDialog;
//
//    @UiField
//    PaperInput titleInput;
//
//    @UiField
//    PaperTextarea descriptionInput;

//    @UiField
//    PaperButton button;

    @Inject
    HomePageView(Binder uiBinder)
    {
        initWidget(uiBinder.createAndBindUi(this));

    }

//    @UiHandler("addButton")
//    protected void onAddButtonClick(ClickEvent e)
//    {
//        addItemDialog.open();
//    }
//
//    @UiHandler("confirmAddButton")
//    protected void onConfirmAddButtonClick(ClickEvent e)
//    {
//        if (!titleInput.getValue().isEmpty()) {
//            addItem(titleInput.getValue(), descriptionInput.getValue());
//            // clear text fields
//            titleInput.setValue("");
//            descriptionInput.setValue("");
//        }
//    }
//
//    private void addItem(String title, String description)
//    {
//        Item item = new Item();
//        item.setTitle(title);
//        item.setDescription(description);
//        content.add(item);
//    }

}
