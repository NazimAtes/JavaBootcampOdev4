package com.example.javabootcampodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javabootcampodev4.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.gitSayfaA.setOnClickListener(view-> {
            Navigation.findNavController(view).navigate(R.id.anasayfa_git_sayfaA2);
        });

        binding.gitSayfaX.setOnClickListener(view->{
            Navigation.findNavController(view).navigate(R.id.anaSayfa_git_sayfaX);
        });

        return binding.getRoot();
    }
}