package com.softnahu.translate2024;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.softnahu.translate2024.databinding.ActivityMainBinding;
import com.softnahu.translate2024.databinding.ActivityResultadoBinding;

public class ResultadoActivity extends AppCompatActivity {
    private ActivityResultadoBinding binding;
    private ResultadoViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityResultadoBinding.inflate(getLayoutInflater());
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ResultadoViewModel.class);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_resultado);
        setContentView(binding.getRoot());

        mv.getMutablePalabra().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
            binding.tvResultado.setText(s);
            }
        });

        mv.getMutableRuta().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
            binding.ivPalabra.setImageResource(integer);
            }
        });
        mv.traducir(getIntent());
        //setContentView(R.layout.activity_resultado);
    }
}