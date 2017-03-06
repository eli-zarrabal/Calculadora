package itsco.edu.calculadora;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int contador = 0;

    Double numero1, numero2, resultado;
    String operador;

    public void onClickIgual(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        numero2 = Double.parseDouble(tv.getText().toString());

        if (operador.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operador.equals("/")) {
            resultado = numero1 / numero2;
        }
        tv.setText(resultado.toString());
    }

    public void onClickSuma(View miView) {
        operador = "+";
        onClickOperacionCapturaNumero1(miView);

        contador=0;
    }

    public void onClickResta(View miView) {
        operador = "-";
        onClickOperacionCapturaNumero1(miView);

        contador=0;
    }

    public void onClickMultiplicacion(View miView) {
        operador = "*";
        onClickOperacionCapturaNumero1(miView);

        contador=0;
    }

    public void onClickDivision(View miView) {
        operador = "/";
        onClickOperacionCapturaNumero1(miView);

        contador=0;
    }

    public void onClickOperacionCapturaNumero1(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickBorrar(View miView) {
        numero1 = 0.0;
        numero2 = 0.0;
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText("");
        contador=0;
    }

    public void onClickBtn1(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "1");
    }

    public void onClickBtn2(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "2");
    }

    public void onClickBtn3(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "3");
    }

    public void onClickBtn4(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "4");
    }

    public void onClickBtn5(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "5");
    }

    public void onClickBtn6(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "6");
    }

    public void onClickBtn7(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "7");
    }

    public void onClickBtn8(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "8");
    }

    public void onClickBtn99(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "9");
    }

    public void onClickBtn0(View miView) {
        TextView tv = (TextView) findViewById(R.id.txt_res);
        tv.setText(tv.getText() + "0");
    }

    public void onClickBtnPunto(View miView) {


        if (contador == 0) {

            TextView tv = (TextView) findViewById(R.id.txt_res);
            tv.setText(tv.getText() + ".");
            operador=(tv.getText().toString());

            if(operador.toString().equals(".")){

                tv.setText("");
                tv.setText(tv.getText()+ "0.");
            }


            contador++;

        } else if (contador == 1) {





        }
    }
}