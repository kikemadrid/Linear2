package com.example.linear2;

import android.content.Context;
import android.widget.LinearLayout;


public class ExtensionLinear  extends LinearLayout {
     private boolean usado;


    public ExtensionLinear(Context context) {
        super(context);
        this.usado = false;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
