package com.example.laba3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn, btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View view) {
        Toast myToast= Toast.makeText(getApplicationContext(),"Мое сообщение", Toast.LENGTH_SHORT);

        myToast.setGravity(Gravity.BOTTOM, 0,100);
        myToast.show();
    }

    public void btn_click2(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Действие")
                .setIcon(R.drawable.test_icon)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();

                        btn=findViewById(R.id.button);
                        btn1=findViewById(R.id.button2);
                        btn2=findViewById(R.id.button3);
                        btn3=findViewById(R.id.button4);

                        btn.setTextColor(Color.RED);
                        btn1.setTextColor(Color.RED);
                        btn2.setTextColor(Color.RED);
                        btn3.setTextColor(Color.RED);
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast myToast= Toast.makeText(getApplicationContext(),"Окно закрыто", Toast.LENGTH_SHORT);

                        myToast.setGravity(Gravity.BOTTOM, 0,100);
                        myToast.show();
                    }
                });
        AlertDialog alert=builder.create();
        alert.show();
    }

    public void btn_click3(View view) {
        String[] items={"Маршрутизатор", "Коммутатор", "Концентратор"};
        boolean[] selectedItems={false,false,false};

        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Тест")
                .setCancelable(true)
                .setMultiChoiceItems(items, selectedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        selectedItems[i]=b;
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String selected="";
                        for (int j=0;j<items.length;j++){
                            if(selectedItems[0]){
                                Toast toast = Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                            else {
                                btn=findViewById(R.id.button);
                                btn1=findViewById(R.id.button2);
                                btn2=findViewById(R.id.button3);
                                btn3=findViewById(R.id.button4);

                                btn.setVisibility(View.INVISIBLE);
                                btn1.setVisibility(View.INVISIBLE);
                                btn2.setVisibility(View.INVISIBLE);
                                btn3.setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                });
        AlertDialog alert=builder.create();
        alert.show();

    }

    public void btn_click4(View view) {
        Toast myToast= Toast.makeText(getApplicationContext(),"Мое сообщение", Toast.LENGTH_LONG);

        myToast.setGravity(Gravity.BOTTOM, 0,100);
        myToast.show();
    }
}