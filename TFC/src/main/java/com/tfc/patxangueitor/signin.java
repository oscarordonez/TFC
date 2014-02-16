package com.tfc.patxangueitor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        View connectbtn = findViewById(R.id.btnOk);
        connectbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(signin.this,mainscreen.class);
                startActivity(intent);
            }
        });

        View cancelbtn = findViewById(R.id.btnCancel);
        cancelbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){ finish(); }
        });

        View newuserbtn = findViewById(R.id.btnNewUser);
        newuserbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent3 = new Intent(signin.this,signup.class);
                startActivity(intent3);
            }
        });
    }
}
