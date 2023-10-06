package com.example.javabootcampodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javabootcampodev4.databinding.FragmentAnasayfaBinding;
import com.example.javabootcampodev4.databinding.FragmentSayfaYBinding;


public class SayfaY extends Fragment {
    private FragmentSayfaYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentSayfaYBinding.inflate(inflater, container, false);

        binding.anasayfaGit.setOnClickListener(view-> {
            Navigation.findNavController(view).navigate(R.id.sayfaY_to_anasayfaFragment);
        });


        return binding.getRoot();
    }
}