package serpis.ed.asuma;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText editText1;
    private EditText editText2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1= findViewById(R.id.editText1);// estamos obteniendo la referencia al editText1
        editText2= findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void buttonAddOnClick(View view){
     //   Log.i(TAG, "buttonAddOnClick");
        // BigDecimal number1 = getNumber1();
     //   BigDecimal number2 = getNumber2();
     //   BigDecimal result = number1.add(number2);
     //   textViewResult.setText(result.toString());
        operation(BigDecimal::add);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void buttonSubtractOnClick(View view){
      //  Log.i(TAG, "buttonSubtractOnClick");
       // BigDecimal number1 = getNumber1();
     //   BigDecimal number2 = getNumber2();
       // BigDecimal result = number1.subtract(number2);
      //  textViewResult.setText(result.toString());
        operation(BigDecimal::subtract);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void operation (BinaryOperator<BigDecimal>binaryOperator){
        Log.i(TAG,"operation");
        BigDecimal number1 = getNumber1();
        BigDecimal number2 = getNumber2();
        BigDecimal result= binaryOperator.apply(number1,number2);
        textViewResult.setText(result.toString());
    }

    private BigDecimal getNumber1(){
        return new BigDecimal(editText1.getText().toString());
    }

    private BigDecimal getNumber2(){
        return new BigDecimal(editText1.getText().toString());
    }
}
