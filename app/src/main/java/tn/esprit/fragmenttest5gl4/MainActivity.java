package tn.esprit.fragmenttest5gl4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frag =findViewById(R.id.frag);

        Button frag1 =findViewById(R.id.fragment1);
        Button frag2 =findViewById(R.id.fragment2);
        Button frag3 =findViewById(R.id.fragment3);

        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment1()).commit();
            }
        });
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment2()).commit();
            }
        });
        frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment3()).commit();
            }
        });

    }
}