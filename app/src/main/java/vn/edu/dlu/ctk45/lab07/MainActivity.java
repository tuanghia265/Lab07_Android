package vn.edu.dlu.ctk45.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnToast,btnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast=(Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });

        btnDialog=(Button) findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogLogin();
            }
        });
    }

    public void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout =inflater.inflate(R.layout.toast_custom,(ViewGroup) findViewById(R.id.toast_root));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    private void DialogLogin(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);

        EditText txtUsername=(EditText) dialog.findViewById(R.id.txtUsername);
        EditText txtPassword=(EditText) dialog.findViewById(R.id.txtPassword);
        Button btnLogin=(Button) dialog.findViewById(R.id.btnLogin);
        Button btnExit=(Button) dialog.findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        dialog.show();
    }
}