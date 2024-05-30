package org.dyn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.helloworld.R;
public class mark extends Activity {
    Button b;
    EditText e1,e2,e3,e4;
    String s1,s2,s3,s4;
    Float tot,per;
    @SuppressLint("ResourceType")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.main1);
        e1= findViewById(R.id.editText1);
        e2= findViewById(R.id.editText2);
        e3= findViewById(R.id.editText3);
        e4= findViewById(R.id.editText4);
        b= findViewById(R.id.button1);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            s1=bundle.getString("s1");
            e1.setText(s1);
            s2=bundle.getString("s2");
            e2.setText(s2);
            s3=bundle.getString("s3");
            e3.setText(s3);
        }
        b.setOnClickListener(v -> {
            tot=Float.parseFloat(s3);
            per=(tot/300)*100;
            s4=per.toString();
            e4.setText(s4);
        });
    }
}

