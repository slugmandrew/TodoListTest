package com.usav.todo.server.guice;

import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;
import com.gwtplatform.dispatch.rpc.server.guice.DispatchServiceImpl;
import com.gwtplatform.dispatch.rpc.server.guice.HttpSessionSecurityCookieFilter;
import com.gwtplatform.dispatch.rpc.shared.ActionImpl;
import com.gwtplatform.dispatch.shared.SecurityCookie;

public class DispatchServletModule extends ServletModule
{
    @Override
    public void configureServlets()
    {
        //filter("*").through(HttpSessionSecurityCookieFilter.class);

       // filter("/*").through(ObjectifyFilter.class);

        serve("/" + ActionImpl.DEFAULT_SERVICE_NAME + "*").with(DispatchServiceImpl.class);

       // bindConstant().annotatedWith(SecurityCookie.class).to("JSESSIONID");
    }
}
