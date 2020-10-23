package io.kangris.flashlight;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;

@DesignerComponent(category = ComponentCategory.EXTENSION, description = "FlashLight", iconName = "images/extension.png", nonVisible = true, version = 1)
@SimpleObject(external = true)
public class FlashLight extends AndroidNonvisibleComponent {
    private static final String LOG_TAG = "FlashLight";
    private ComponentContainer container;
    private Activity activity;
    private Context context;
    private boolean state;

    public FlashLight(ComponentContainer container) {
        super(container.$form());
        context = container.$context();
        activity = container.$context();
    }

    @SimpleFunction
    public void Run() {
                if(!state) {

                    CameraManager cameraManager = (CameraManager) activity.getSystemService(Context.CAMERA_SERVICE);

                    try {
                        String cameraId = cameraManager.getCameraIdList()[0];
                        cameraManager.setTorchMode(cameraId, true);
                        state = true;

                    }
                    catch (CameraAccessException e)
                    { }
                }
                    else
                    {
                            CameraManager cameraManager = (CameraManager) activity.getSystemService(Context.CAMERA_SERVICE);
                            try {
                                String cameraId = cameraManager.getCameraIdList()[0];
                                cameraManager.setTorchMode(cameraId, false);
                                state = false;

                            } catch (CameraAccessException e)
                            { }
                    }

                }

}
