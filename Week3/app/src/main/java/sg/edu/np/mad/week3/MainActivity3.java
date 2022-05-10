package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        countDownTimer(); //Run CountDownTimer
    }

    //Random OTP Function
    private int randomOTP() {
        Random ran = new Random();
        int value = ran.nextInt(100000);
        return value;
    }

    //CountDown Timer Function
    CountDownTimer myCountDown;
    private void countDownTimer() {
        //OTP Message TextView
        TextView myOTPMessage = findViewById(R.id.otpText);
        myOTPMessage.setText("Your OTP is: " + String.valueOf(randomOTP())); //Set (and convert from int to string) randomOTP as message

        //CountDown Timer
        myCountDown = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //Update TextView on every tick of the CountDown
                TextView myWarning = findViewById(R.id.countdownText);
                myWarning.setText("Warning! - Your OTP expires in " + millisUntilFinished/1000 + " seconds.");
            }

            @Override
            public void onFinish() {
                //Random OTP when CountDown finishes
                myOTPMessage.setText("Your OTP is: " + String.valueOf(randomOTP())); //Set (and convert from int to string) new randomOTP as message
                myCountDown.cancel(); //End CountDown Timer
            }
        };
        myCountDown.start(); //Restart CountDown Timer
    }
}