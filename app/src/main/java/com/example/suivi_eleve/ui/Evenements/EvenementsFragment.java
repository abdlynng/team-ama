package com.example.suivi_eleve.ui.Evenements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.suivi_eleve.R;

public class EvenementsFragment extends Fragment {

    private EvenementsViewModel evenementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        evenementsViewModel =
                ViewModelProviders.of(this).get(EvenementsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_evenements, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        evenementsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}