package com.habae.peter.helloworld;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.vending.billing.IInAppBillingService;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
       Button button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button b = (Button) v;
                b.setText('X');

            }
        });

        Button button2 = (Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button b = (Button) v;
                b.setText('X');

            }
        });
*/
    }

    //Binding der App mit IInAppBillingService
    IInAppBillingService mService;

    ServiceConnection mServiceConn = new ServiceConnection() {
        @Override
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
        }

        @Override
        public void onServiceConnected(ComponentName name,
                                       IBinder service) {
            mService = IInAppBillingService.Stub.asInterface(service);
        }
    };

    public void sayHello(View view) {
        Toast t = Toast.makeText(this, "POLO", Toast.LENGTH_SHORT);
        t.show();
    }

    public void sayDere(View view) {
        Toast u = Toast.makeText(this, "Dere", Toast.LENGTH_SHORT);
        u.show();
    }

    public void sayUp(View view) {
        Toast v = Toast.makeText(this, "UUUUUUUP!!!!", Toast.LENGTH_SHORT);
        v.show();
    }

    public void sayOis(View view) {
        Toast w = Toast.makeText(this, "Ois", Toast.LENGTH_SHORT);
        w.show();
    }

    public void sayBaby(View view) {
        Toast x = Toast.makeText(this, "Baby", Toast.LENGTH_SHORT);
        x.show();
    }

    public void sayBmeise(View view) {
        Toast y = Toast.makeText(this, "Bmeise", Toast.LENGTH_SHORT);
        y.show();
    }

    public void sayBatman(View view) {
        Toast z = Toast.makeText(this, "Batman", Toast.LENGTH_SHORT);
        z.show();
    }

    public void sayHier(View view) {
        Toast a = Toast.makeText(this, "Hier ist die Party!!", Toast.LENGTH_SHORT);
        a.show();
    }

    public void sayDrei(View view) {
        Toast b = Toast.makeText(this, "3", Toast.LENGTH_SHORT);
        b.show();
    }


}
