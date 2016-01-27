package com.usav.todo.server.guice;

import com.google.inject.Singleton;
import com.googlecode.objectify.ObjectifyFilter;
import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;

public class ServerModule extends HandlerModule
{
    @Override
    protected void configureHandlers()
    {
        //bind(ObjectifyFilter.class).in(Singleton.class);

    }
}
