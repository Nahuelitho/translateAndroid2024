package com.softnahu.translate2024;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void traducir(String palabra){
        //Context context = getApplication().getApplicationContext();
        if(palabra.isEmpty()){
            Toast.makeText(getApplication(),"Ingrese una palabra",Toast.LENGTH_SHORT).show();
        }else {
        Intent intent = new Intent(getApplication(), ResultadoActivity.class);
        intent.putExtra("palabra",palabra);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(intent);//por que estoy desde un model
    }
    }
}
