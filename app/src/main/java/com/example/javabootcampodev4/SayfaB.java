package com.example.javabootcampodev4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.javabootcampodev4.databinding.FragmentSayfaBBinding;


public class SayfaB extends Fragment {
    private FragmentSayfaBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentSayfaBBinding.inflate(inflater, container, false);

        binding.gitSayfaY.setOnClickListener(view-> {
            Navigation.findNavController(view).navigate(R.id.sayfaB_git_sayfaY);
        });
        return binding.getRoot();
    }
}