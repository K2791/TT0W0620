package com.example.ahola.demo1;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

//Pääaktiviteetti, jolla kutsutaan MainGLSurfaceView

public class OpenGLES20Activity extends Activity {

    private MainGLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new MainGLSurfaceView(this);
        setContentView(mGLView);
    }


}