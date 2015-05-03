package com.example.kimeunji.soheeee;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView editId= (TextView) findViewById(R.id.edit_id);
        Button btnSetting= (Button) findViewById(R.id.btn_setting);

        Toast.makeText(this, "토스트 메세지", Toast.LENGTH_SHORT).show();

    }

    public void buttonOnClick(View v){
       startActivity(new Intent(getApplicationContext(), SettingActivity.class));
    }

}
