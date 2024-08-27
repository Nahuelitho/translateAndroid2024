package com.softnahu.translate2024;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.softnahu.translate2024.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ResultadoViewModel extends AndroidViewModel {
    private ArrayList<Palabras> listado;
    private MutableLiveData<String>mutablePalabra;
    private MutableLiveData<Integer>mutableRuta;
    private ActivityMainBinding binding;
    public ResultadoViewModel(@NonNull Application application) {
        super(application);
        listado = new ArrayList<>();
        listado.add(new Palabras("oso","bear",R.drawable.oso));
        listado.add(new Palabras("casa","house",R.drawable.casa));
        listado.add(new Palabras("auto","car",R.drawable.casa));
        listado.add(new Palabras("perro","dog",R.drawable.casa));
    }
    public LiveData<String> getMutablePalabra(){
        if(mutablePalabra==null){
            mutablePalabra=new MutableLiveData<>();
        }
        return mutablePalabra;
    }

    public LiveData<Integer> getMutableRuta(){
        if(mutableRuta==null){
            mutableRuta=new MutableLiveData<>();
        }
        return mutableRuta;
    }

    public void traducir(Intent intent){
        String palabra = intent.getStringExtra("palabra");
        if (palabra!=null){
        listado.forEach(p -> {
            if(p.getPalabraEspañol().equalsIgnoreCase(palabra)){
                mutablePalabra.setValue(p.getPalabraIngles());
                mutableRuta.setValue(p.getImgId());
                return;
            }
            else {
            mutablePalabra.setValue("Palabra no disponible");
            mutableRuta.setValue(R.drawable.error);}
        });}
        }
    }


