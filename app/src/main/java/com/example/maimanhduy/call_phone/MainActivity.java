package com.example.maimanhduy.call_phone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btcall = (Button)findViewById(R.id.call);
        final EditText editText = (EditText) findViewById(R.id.edtNumber);
        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
                startActivity(Intent.createChooser(callIntent, "Choose via ...."));
            }
        });
    }
}
