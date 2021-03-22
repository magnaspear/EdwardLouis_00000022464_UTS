package id.ac.umn.edwardlouisrago_00000022464_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private ImageButton goToHome;
    private Button loginBtn;
    private EditText loginUsername;
    private EditText loginPassword;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        goToHome = findViewById(R.id.backButtonLogin);

        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToHome = new Intent(Login.this, MainActivity.class);
                startActivity(backToHome);
            }
        });

        loginUsername = (EditText) findViewById(R.id.username);
        loginPassword = (EditText) findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = loginUsername.getText().toString();
                password = loginPassword.getText().toString();

                if (username.equals("uasmobile") && password.equals("uasmobilegenap")) {
                    Intent goToMainPage = new Intent(Login.this, Home.class);
                    startActivity(goToMainPage);
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}