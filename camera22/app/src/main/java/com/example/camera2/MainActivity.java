package com.example.camera2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CameraManager mCameraManager;
    String cameraID;
    Camera mCamera;


    static boolean isLigado=false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ligarlanterna(View view){
        try {

            chamaLuizinha();


        }catch (Exception deu_ruim){
            Toast.makeText(this, deu_ruim.toString(), Toast.LENGTH_SHORT).show();

        }


    }

    private void chamaLuizinha() {
        isLigado = !isLigado;

        try {
            mCameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            if (isLigado) {
                for (String id : mCameraManager.getCameraIdList()) {
                    mCameraManager.setTorchMode(id, true);
                }
            }
            else {
                for (String id : mCameraManager.getCameraIdList()) {
                    mCameraManager.setTorchMode(id, false);
                }
            }
        }catch (Exception erro2){
            Toast.makeText(this, erro2.toString(), Toast.LENGTH_SHORT).show();

        }

    }
private void tirafoto(){


}

public void chamaCamera(View view){
try {
   Camera cam = mCamera.open();

    }catch(Exception dei_ruim){

    Toast.makeText(this, dei_ruim.toString(), Toast.LENGTH_SHORT).show();
}

    }
}
