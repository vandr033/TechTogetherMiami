package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean add = false;
    boolean mult = false;
    boolean div = false;
    boolean sub = false;

    double value=0,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnAC = findViewById(R.id.btnAC);
        ImageButton btnPlusMinus = findViewById(R.id.btnPlusMinus);
        ImageButton btnDelete = findViewById(R.id.btnDelete);
        ImageButton btn7 = findViewById(R.id.btn7);
        ImageButton btn8 = findViewById(R.id.btn8);
        ImageButton btn9 = findViewById(R.id.btn9);
        ImageButton btn4 = findViewById(R.id.btn4);
        ImageButton btn5 = findViewById(R.id.btn5);
        ImageButton btn6 = findViewById(R.id.btn6);
        ImageButton btn1 = findViewById(R.id.btn1);
        ImageButton btn2 = findViewById(R.id.btn2);
        ImageButton btn3 = findViewById(R.id.btn3);
        ImageButton btn0 = findViewById(R.id.btn0);
        ImageButton btnX = findViewById(R.id.btnX);
        ImageButton btnMinus = findViewById(R.id.btnMinus);
        ImageButton btnPlus = findViewById(R.id.btnPlus);
        ImageButton btnDiv = findViewById(R.id.btnDivide);
        ImageButton btnEqual = findViewById(R.id.btnEqual);
        ImageButton btnDot = findViewById(R.id.btnDot);
        TextView tvMain = findViewById(R.id.tvMain);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "0";
                    tvMain.setText(text);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "1";
                    tvMain.setText(text);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "2";
                    tvMain.setText(text);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "3";
                    tvMain.setText(text);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "5";
                    tvMain.setText(text);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "5";
                    tvMain.setText(text);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "6";
                    tvMain.setText(text);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "7";
                    tvMain.setText(text);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "8";
                    tvMain.setText(text);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((tvMain.getText().toString()).length() <10) {
                    String text = (String) tvMain.getText();
                    text = text += "9";
                    tvMain.setText(text);
                }
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("");
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) tvMain.getText();
                text = text.substring(0,text.length()-1);
                tvMain.setText(text);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((tvMain.getText().toString()).length() < 10) {
                    if(tvMain.getText().toString().contains(".")){
                    }else {
                        String text = (String) tvMain.getText();
                        text = text += ".";
                        tvMain.setText(text);
                    }
                }
            }
        });
        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(tvMain.getText().toString());
                value *= -1;
                tvMain.setText(value+"");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(tvMain.getText().toString());
                add = true;
                sub = false;
                div = false;
                mult = false;
                tvMain.setText("");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(tvMain.getText().toString());
                sub = true;
                add = false;
                div = false;
                mult = false;
                tvMain.setText("");
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(tvMain.getText().toString());
                mult = true;
                div = false;
                add = false;
                sub = false;
                tvMain.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = Double.parseDouble(tvMain.getText().toString());
                div = true;
                add = false;
                sub = false;
                mult = false;
                tvMain.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value==0){
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_LONG).show();
                }else {
                    value2 = Double.parseDouble(tvMain.getText().toString());
                    if (add == true) {
                        tvMain.setText((value + value2) + "");
                    } else if (sub == true) {
                        tvMain.setText(value - value2 + "");
                    } else if (div == true) {
                        tvMain.setText((value / value2) + "");
                    } else if (mult = true) {
                        tvMain.setText(value * value2 + "");

                    }
                }
            }
        });
    }







}