package com.example.bt06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed_a, ed_b;
    TextView tv_kq;
    Button bt_cong,bt_tru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_a=(EditText)findViewById(R.id.editTexta);
        ed_b=(EditText)findViewById(R.id.editTextb);
        tv_kq=(TextView)findViewById(R.id.textViewKetQua);
        bt_cong=(Button)findViewById(R.id.buttonCong);
        bt_tru=(Button)findViewById(R.id.buttonTru);
        bt_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(ed_a.getText().toString());
                float b=Float.parseFloat(ed_b.getText().toString());
                float kq=a+b;
                tv_kq.setText(Float.toString(kq));
            }

        });
        bt_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(ed_a.getText().toString());
                float b=Float.parseFloat(ed_b.getText().toString());
                float kq=a-b;
                tv_kq.setText(Float.toString(kq));
            }

        });

    }
}
