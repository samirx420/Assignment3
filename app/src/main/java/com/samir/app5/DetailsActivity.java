package com.samir.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public   class DetailsActivity extends AppCompatActivity {
    CircleImageView circleImg;
    TextView tvName, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circleImg = findViewById(R.id.circleImg);
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            circleImg.setImageResource(bundle.getInt("Image"));
            tvName.setText(bundle.getString("Name"));
            tvPhone.setText(bundle.getString("Phone"));

        }

    }
}
