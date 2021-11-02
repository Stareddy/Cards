package com.jaraspi.cards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.jaraspi.cards.databinding.FragmentCrossBinding;
import com.jaraspi.cards.databinding.FragmentOverviewBinding;

public class FragmentOverview extends Fragment {

    private FragmentOverviewBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentOverviewBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.textviewDiamondSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FragmentOverview.this)
                        .navigate(R.id.action_Jump_To_Diamond);
            }
        });

        binding.textviewCrossSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FragmentOverview.this)
                        .navigate(R.id.action_Jump_To_Cross);
            }
        });

        binding.textviewHeartSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FragmentOverview.this)
                        .navigate(R.id.action_Jump_To_Heart);
            }
        });

        binding.textviewSpadeSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FragmentOverview.this)
                        .navigate(R.id.action_Jump_To_Spade);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}