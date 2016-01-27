package com.usav.todo.client.gin;

import com.allen_sauer.gwt.log.client.Log;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

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
        Polymer.importHref("iron-icons/iron-icons.html", new Function()
        {
            public Object call(Object arg)
            {
                // The app is executed when all imports succeed.
                placeManager.revealCurrentPlace();

                Log.info("Bootstrap done!");

                return null;
            }
        });


    }
}
