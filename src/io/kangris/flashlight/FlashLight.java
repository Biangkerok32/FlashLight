package io.kangris.flashlight;


import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;

@DesignerComponent(category = ComponentCategory.EXTENSION, description = "FlashLight", iconName = "images/extension.png", nonVisible = true, version = 1)
@SimpleObject(external = true)
public class FbInterstitial extends AndroidNonvisibleComponent {
    private static final String LOG_TAG = "FlashLight";
    private ComponentContainer container;
    private Activity activity;
    private Context context;

    public FbInterstitial(ComponentContainer container) {
        super(container.$form());
        context = container.$context();
        activity = container.$context();
    }

}
