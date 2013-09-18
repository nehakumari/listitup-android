package com.droid.todo;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
public class MainActivity extends Activity
{
    Button submit;
    EditText pwd;
    static String passwrd;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        pwd = (EditText)findViewById(R.id.pwd);
        Button submit= (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View arg0) {
                passwrd = pwd.getText().toString();
                if(passwrd.equals("neha"))
                   {
                     Intent intent = new Intent("com.droid.todo.HOME");
                     startActivity(intent);
                     finish();
                   }
                else
                     
                      Toast.makeText(getApplicationContext(),"Wrong password",Toast.LENGTH_LONG).show();
           }
        });
    }
}

