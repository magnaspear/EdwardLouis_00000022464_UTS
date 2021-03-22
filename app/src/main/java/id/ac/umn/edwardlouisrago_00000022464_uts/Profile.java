package id.ac.umn.edwardlouisrago_00000022464_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getIntent().getStringExtra("from").equals("MainActivity")) {
                    Intent backToProfile = new Intent(Profile.this, MainActivity.class);
                    startActivity(backToProfile);
                    finish();
                } else if (getIntent().getStringExtra("from").equals("Home")) {
                    Intent backToHome = new Intent(Profile.this, Home.class);
                    startActivity(backToHome);
                    finish();
                }
            }
        });
    }
}