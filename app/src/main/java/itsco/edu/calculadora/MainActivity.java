package itsco.edu.calculadora;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double n1,n2,resultado;
    String operador;

    public void onClickIgual(View miView)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        n2 = Double.parseDouble(res.getText().toString());

        if(operador.equals("+"))
        {
            resultado= n1+n2;
        }
        else if(operador.equals("-"))
        {
            resultado= n1-n2;
        }
        else if(operador.equals("*"))
        {
            resultado= n1*n2;
        }
        else if(operador.equals("/"))
        {
            resultado= n1/n2;
        }
        res.setText(resultado.toString());
    }

    public void onClickSuma(View view)
    {
        operador="+";
        onClickOperacionCapturaNumero1(view);
    }
    public void onClickResta(View view)
    {
        operador="-";
        onClickOperacionCapturaNumero1(view);
    }
    public void onClickMultiplicacion(View view)
    {
        operador="*";
        onClickOperacionCapturaNumero1(view);
    }
    public void onClickDivision(View view)
    {
        operador="/";
        onClickOperacionCapturaNumero1(view);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        n1 = Double.parseDouble(res.getText().toString());
        res.setText("");
    }

    public void onClickBorrar(View miView)
    {
        n1=0.0;
        n2=0.0;
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText("");
    }

    public void onClickBtn1(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "1");
    }
    public void onClickBtn2(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
       res.setText(res.getText() + "2");
    }
    public void onClickBtn3(View view)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "3");
    }
    public void onClickBtn4(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "4");
    }
    public void onClickBtn5(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "5");
    }
    public void onClickBtn6(View view)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "6");
    }
    public void onClickBtn7(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "7");
    }
    public void onClickBtn8(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "8");
    }
    public void onClickBtn99(View view)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "9");
    }
    public void onClickBtn0(View view)
    {
        TextView res = (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + "0");
    }
    public void onClickBtnPunto(View view)
    {
        TextView res= (TextView) findViewById(R.id.txt_resultado) ;
        res.setText(res.getText() + ".");
        operador = (res.getText().toString());
        if(operador.toString().equals(".")){
            res.setText("");
            res.setText(res.getText() + "0.");

        }

    }

}

