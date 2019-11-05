package com.example.proyecto006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] paises = {"Españita","Argentina","Chile","Peru","Ecuador","Brasil" };
    private String[] habitantes = {"1000000","10025","41112122","123456798","12341234","11111"};
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1 =(ListView)findViewById(R.id.lv1);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Población de "+ lv1.getItemAtPosition(i) + " es "+ habitantes[i]);
            }
        });
    }
}
