package com.example.javabootcampodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.javabootcampodev4.databinding.FragmentSayfaABinding;


public class SayfaA extends Fragment {
    private FragmentSayfaABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentSayfaABinding.inflate(inflater, container, false);

        binding.gitSayfaB.setOnClickListener(view->{
            Navigation.findNavController(view).navigate(R.id.sayfaA_git_sayfaB);
        });


        return binding.getRoot();
    }
}