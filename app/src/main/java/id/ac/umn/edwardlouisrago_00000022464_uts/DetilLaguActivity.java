package id.ac.umn.edwardlouisrago_00000022464_uts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetilLaguActivity extends AppCompatActivity {
    private TextView labelLagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagu_item_layout);
        labelLagu = (TextView) findViewById(R.id.songLabel);
    }

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();
    SumberLagu sl = (SumberLagu) bundle.getSerializable("DetilLagu");
    MediaController controller = new MediaController(this);
}
