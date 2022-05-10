package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main Activity";
    private static String etUsername; //Store Username Input
    private static String etPassword; //Store Password Input

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myLoginButton = findViewById(R.id.loginButton);
        myLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etMyUsername = findViewById(R.id.editTextUsername);
                etUsername = etMyUsername.getText().toString(); //Get Username Input
                EditText etMyPassword = findViewById(R.id.editTextPassword);
                etPassword = etMyPassword.getText().toString(); //Get Password Input

                Log.v(TAG, "Login: " + etUsername + " " + etPassword); //Log Login Credentials

                //Create new User object
                User user = new User();
                user.setUsername(etUsername); //Set Username
                user.setPassword(etPassword); //Set Password

                Bundle myBundle = new Bundle(); //Bundle Items
                myBundle.putString("Username", user.getUsername()); //Insert Username String into Bundle
                myBundle.putString("Password", user.getPassword()); //Insert Password String into Bundle

                //Go to MainActivity2 page
                //Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                //myIntent.putExtras(myBundle); //Insert Bundle into Intent to transfer to MainActivity2.java
                //startActivity(myIntent);

                //Go to MainActivity3 page
                Intent myIntent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(myIntent);
            }
        });

    }
}