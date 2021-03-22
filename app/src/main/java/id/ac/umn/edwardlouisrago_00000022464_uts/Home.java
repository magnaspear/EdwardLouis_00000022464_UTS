package id.ac.umn.edwardlouisrago_00000022464_uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Home extends AppCompatActivity {
    RecyclerView rvDaftarLagu;
    DaftarLaguAdapter mAdapter;
    LinkedList<SumberLagu> daftarLagu = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        isiDaftarLagu();
        rvDaftarLagu = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarLaguAdapter(this, daftarLagu);
        rvDaftarLagu.setAdapter(mAdapter);
        rvDaftarLagu.setLayoutManager(new LinearLayoutManager( this));

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Selamat Datang")
                .setMessage("Edward Louis Rago \n 00000022464")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {}
                })
                .show();
    }

    public void isiDaftarLagu(){
        daftarLagu.add(new SumberLagu("Testing1",
                R.raw.testing1));
        daftarLagu.add(new SumberLagu("Testing2",
                R.raw.testing2));
        daftarLagu.add(new SumberLagu("Testing3",
                R.raw.testing3));
        daftarLagu.add(new SumberLagu("Testing4",
                R.raw.testing4));
        daftarLagu.add(new SumberLagu("Testing5",
                R.raw.testing5));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuProfil:
                Intent goToProfile = new Intent(Home.this, Profile.class);
                startActivity(goToProfile);
                return true;
            case R.id.menuLogOut:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}