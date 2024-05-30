package org.dyn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.helloworld.R;

public class DynActivity extends Activity {
    Button b1;
    EditText e1,e2,e3,e4,e5;
    String s1,s2,s3;
    Integer i1,i2,i3,i4;
    @SuppressLint("ResourceType")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.main);
        b1= findViewById(R.id.button1);
        e1= findViewById(R.id.editText1);
        e2= findViewById(R.id.editText2);
        e3= findViewById(R.id.editText3);
        e4= findViewById(R.id.editText4);
        e5= findViewById(R.id.editText5);
        b1.setOnClickListener(v -> {
            s1=e1.getText().toString();
            s2=e2.getText().toString();
            i1=Integer.parseInt(e3.getText().toString());
            i2=Integer.parseInt(e4.getText().toString());
            i3=Integer.parseInt(e5.getText().toString());
            i4=i1+i2+i3;
            s3=i4.toString();
            Bundle bundle=new Bundle();
            bundle.putString("s1",s1);
            bundle.putString("s2",s2);
            bundle.putString("s3",s3);
            Intent i=new Intent(DynActivity.this, org.dyn.mark.class);
            i.putExtras(bundle);
            startActivity(i);
        });
    }
}