package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static String TAG = "Main Activity 2";
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent receiving = getIntent(); //Receive Username and Password
        username = receiving.getStringExtra("Username"); //Receive from Bundle and store into username
        password = receiving.getStringExtra("Password"); //Receive from Bundle and store into password

        TextView myTextView = findViewById(R.id.textView2); //Find Username TextView by id
        myTextView.setText(username); //Display Username on TextView

        //Replace Image of ImageView
        //ImageView myImageView = findViewById(R.id.imageView2);
        //myImageView.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pic)) //"pic" is the name of image

        //Play Media Audio File
        //MediaPlayer myMedia = MediaPlayer.create(this, R.raw.baby_laughing) //"baby_laughing" is the name of audio file.
        //myMedia.start();

        //Play Media Video File
        //VideoView myVideoView = findViewById(R.id.videoView);
        //myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pic)) //"pic" is the name of image
        //MediaPlayer myMedia = MediaPlayer.create(this, R.raw.baby_laughing) //"baby_laughing" is the name of audio file.
        //myMedia.start();

        Log.v(TAG, "Received: " + username + password);
    }
}