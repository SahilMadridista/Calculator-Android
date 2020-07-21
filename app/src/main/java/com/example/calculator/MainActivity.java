package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.itis.libs.parserng.android.expressParser.MathExpression;

public class MainActivity extends AppCompatActivity {

   Button zero,one,two,three,four,five,six,seven,eight,nine,dot,all_clear,add,sub,multi,div,equals,del,left,right;
   TextView QueryText,ResultText;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      QueryText = findViewById(R.id.query_text);
      ResultText = findViewById(R.id.result_text);

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
      del = findViewById(R.id.btn_one_back);
      left = findViewById(R.id.left);
      right = findViewById(R.id.right);

      zero.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "0";
            QueryText.setText(result);
         }
      });

      one.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "1";
            QueryText.setText(result);
         }
      });

      two.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "2";
            QueryText.setText(result);
         }
      });

      three.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "3";
            QueryText.setText(result);
         }
      });

      four.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "4";
            QueryText.setText(result);
         }
      });

      five.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "5";
            QueryText.setText(result);
         }
      });

      six.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "6";
            QueryText.setText(result);
         }
      });

      seven.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "7";
            QueryText.setText(result);
         }
      });

      eight.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "8";
            QueryText.setText(result);
         }
      });

      nine.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "9";
            QueryText.setText(result);
         }
      });

      all_clear.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            if(QueryText.getText().toString().isEmpty()){
               Toast.makeText(getApplicationContext(),"Already empty",Toast.LENGTH_SHORT).show();
            }
            else {
               QueryText.setText("");
            }

            ResultText.setText("");

         }
      });

      del.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            int length = text.length();

            if(length==0){
               Toast.makeText(getApplicationContext(),"Already empty",Toast.LENGTH_SHORT).show();
            }

            else if(text.equals("SYNTAX ERROR")){
               QueryText.setText("");
            }
            else{
               text = text.substring(0,length-1);
               QueryText.setText(text);
            }

         }
      });

      del.setOnLongClickListener(new View.OnLongClickListener() {
         @Override
         public boolean onLongClick(View view) {

            QueryText.setText("");
            ResultText.setText("");
            Toast.makeText(getApplicationContext(),"Cleared",Toast.LENGTH_SHORT).show();
            return true;
         }
      });

      dot.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            int length = text.length();

            if(length == 0){
               Toast.makeText(getApplicationContext(),"Can't start with decimal",Toast.LENGTH_SHORT).show();
               return;
            }

            if(text.charAt(length-1) == '.'){
               Toast.makeText(getApplicationContext(),"Can't insert 2 consecutive decimals",Toast.LENGTH_SHORT).show();
            }
            else {
               String result = text + ".";
               QueryText.setText(result);
            }

         }
      });

      add.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "+";
            QueryText.setText(result);
         }
      });

      sub.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "-";
            QueryText.setText(result);
         }
      });

      multi.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "*";
            QueryText.setText(result);
         }
      });

      div.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "/";
            QueryText.setText(result);
         }
      });

      left.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + "(";
            QueryText.setText(result);
         }
      });

      right.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String text = QueryText.getText().toString().trim();
            String result = text + ")";
            QueryText.setText(result);
         }
      });


      equals.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            try {
               String query = QueryText.getText().toString().trim();

               if(QueryText.getText().toString().length() == 0){
                  Toast.makeText(getApplicationContext(),"Can't process empty query",Toast.LENGTH_SHORT).show();
               }
               else{
                  MathExpression mathExpression = new MathExpression(query);
                  double roundOff = Double.parseDouble(mathExpression.solve());
                  double value = Math.floor(roundOff*10000)/10000d;
                  ResultText.setText(query);

                  String ans = String.valueOf(value);
                  int len = ans.length();

                  if(ans.charAt(len-1) =='0' && ans.charAt(len-2) == '.'){
                     ans = ans.substring(0,len-2);
                     QueryText.setText(ans);
                     QueryText.setTextSize(35);
                  }

                  else {
                     QueryText.setText(String.valueOf(value));
                     QueryText.setTextSize(35);
                  }

               }
            }

            catch (Exception e){
               Toast.makeText(getApplicationContext(),"Invalid syntax",Toast.LENGTH_SHORT).show();
            }

         }
      });

   }

}