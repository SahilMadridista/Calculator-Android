package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button zero,one,two,three,four,five,six,seven,eight,nine,dot,all_clear,add,sub,multi,div,equals;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      zero = findViewById(R.id.btn0);
      one = findViewById(R.id.btn1);
      two = findViewById(R.id.btn2);
      three = findViewById(R.id.btn3);
      four = findViewById(R.id.btn4);
      five = findViewById(R.id.btn5);
      six = findViewById(R.id.btn6);
      seven = findViewById(R.id.btn7);
      eight = findViewById(R.id.btn8);
      nine = findViewById(R.id.btn9);
      dot = findViewById(R.id.btn_dot);
      all_clear = findViewById(R.id.btn_all_clear);
      add = findViewById(R.id.btn_add);
      sub = findViewById(R.id.btn_sub);
      multi = findViewById(R.id.btn_multiply);
      div = findViewById(R.id.btn_div);
      equals = findViewById(R.id.btn_equal);



   }
}