package com.jmk.edu.gridlayoutcomputer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub,btnMul,btnDiv;
    TextView txtResult;
    String num1, num2; Integer result;
    Button[] numButtons = new Button[10];
    Integer[]numBtnIDs = {R.id.btnNum0.R.id.btnNum1,R.id.btnNum2,R.id.btnNum3,R.id.btnNum4,R.id.btnNum5,R.id.btnNum6,R.id.btnNum7,R.id.btnNum8,R.id.btnNum9}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
