package com.samir.app5.ui.area;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.samir.app5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment {

    private AreaViewModel areaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        areaViewModel =
                ViewModelProviders.of(this).get(AreaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_area, container, false);
        final EditText editText = root.findViewById(R.id.etradius);
        final Button button = root.findViewById(R.id.btnradius);
        areaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (TextUtils.isEmpty(editText.getText().toString())) {
                            Toast.makeText(getActivity(), "Enter radius", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        float radius = Float.parseFloat(editText.getText().toString());
                        float area = (22/7) * radius * radius;

                        Toast.makeText(getActivity(), "Area of circle : " + area, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
        return root;
    }
}
