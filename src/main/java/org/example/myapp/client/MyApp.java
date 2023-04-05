package org.example.myapp.client;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.DomGlobal;

public class MyApp implements EntryPoint {

    /**
     * This method is run when the application loads.
     */
    @Override
    public void onModuleLoad() {
        DomGlobal.alert("Hello world");
    }
}
