package com.usav.todo.client.gin;

import com.allen_sauer.gwt.log.client.Log;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.IronIconElement;
import com.vaadin.polymer.paper.PaperButtonElement;
import com.vaadin.polymer.paper.PaperCheckboxElement;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.PaperFabElement;
import com.vaadin.polymer.paper.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.PaperIconItemElement;
import com.vaadin.polymer.paper.PaperInputElement;
import com.vaadin.polymer.paper.PaperRippleElement;
import com.vaadin.polymer.paper.PaperTextareaElement;
import com.vaadin.polymer.paper.PaperToolbarElement;

import java.util.Arrays;

/**
 * Created by Drew on 23/07/2015.
 */
public class BootstrapperImpl implements Bootstrapper
{
    private final PlaceManager placeManager;

    @Inject
    BootstrapperImpl(PlaceManager placeManager)
    {
        this.placeManager = placeManager;
    }

    @Override
    public void onBootstrap()
    {
        Log.info("Bootstrapping...");

        // We have to load icon sets before run application
        Polymer.importHref(Arrays.asList("iron-icons/iron-icons.html",
                                         PaperIconItemElement.SRC,
                                         PaperRippleElement.SRC,
                                         IronIconElement.SRC,
                                         PaperDrawerPanelElement.SRC,
                                         PaperHeaderPanelElement.SRC,
                                         PaperToolbarElement.SRC,
                                         PaperFabElement.SRC,
                                         PaperDialogElement.SRC,
                                         PaperTextareaElement.SRC,
                                         PaperInputElement.SRC,
                                         PaperButtonElement.SRC,
                                         PaperCheckboxElement.SRC), arg -> {

            placeManager.revealCurrentPlace();

            Log.info("BootstrapperImpl -> onBootstrap done");

            return null;

        });

    }
}
