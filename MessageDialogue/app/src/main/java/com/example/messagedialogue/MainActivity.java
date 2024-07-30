package com.example.messagedialogue;

import android.os.Bundle;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        System.out.println("on create");
    }

    public void showAlert(String pesan){
        AlertDialog.Builder buatAlert =new AlertDialog.Builder(this);
        buatAlert.setTitle("Tes");
        buatAlert.setMessage(pesan);
        buatAlert.show();
    }
    public void showAlertButton(String pesan){
        AlertDialog.Builder showAlert = new AlertDialog.Builder(this);
        showAlert.setTitle("PERINGATAN KERAS");
        showAlert.setMessage(pesan);
        showAlert.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("sudah dihapus");
            }
        });
        showAlert.setNegativeButton("Alert", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("blom dihapus");
            }
        });
        showAlert.show();
    }
    public void btnToast(View view) {
        showToast("Toast");
    }

    public void btnAlertDialogButton(View view) {
        showAlertButton(" aku mau ngehapus");
    }


}