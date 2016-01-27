package com.usav.todo.client.gin;

import com.allen_sauer.gwt.log.client.Log;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperFabElement;
import com.vaadin.polymer.paper.element.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;
import com.vaadin.polymer.paper.element.PaperRippleElement;
import com.vaadin.polymer.paper.element.PaperToolbarElement;

import java.util.Arrays;

/**
 * Created by Drew on 23/07/2015.
 */
public class BootstrapperImpl implements Bootstrapper {
    private final PlaceManager placeManager;

    @Inject
    BootstrapperImpl(PlaceManager placeManager) {
        this.placeManager = placeManager;
    }

    @Override
    public void onBootstrap() {
        Log.info("Bootstrapping...");

        // We have to load icon sets before run application
        Polymer.importHref(Arrays.asList("iron-icons/iron-icons.html",
                PaperIconItemElement.SRC,
                IronIconElement.SRC,
                PaperRippleElement.SRC,
                PaperDrawerPanelElement.SRC,
                PaperHeaderPanelElement.SRC,
                PaperToolbarElement.SRC,
                PaperFabElement.SRC), arg -> {

            placeManager.revealCurrentPlace();

            Log.info("BootstrapperImpl -> onBootstrap done");

            return null;

        });

    }
}
