package com.example.javabootcampodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javabootcampodev4.databinding.FragmentAnasayfaBinding;
import com.example.javabootcampodev4.databinding.FragmentSayfaXBinding;


public class SayfaX extends Fragment {
    private FragmentSayfaXBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentSayfaXBinding.inflate(inflater, container, false);

        binding.gitSayfaY2.setOnClickListener(view-> {
            Navigation.findNavController(view).navigate(R.id.ayfaX_git_sayfaY);
        });

        return binding.getRoot();
    }
}