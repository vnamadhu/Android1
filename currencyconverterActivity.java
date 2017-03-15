package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

 public class currencyconverterActivity extends AppCompatActivity {

    private Spinner spCurrencySource;
    private Spinner spCurrencyDestination;
    private EditText etCurrency1;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currencyconverter_layout);
        spCurrencySource = (Spinner) findViewById(R.id.spCurrencySource);
        spCurrencyDestination = (Spinner) findViewById(R.id.spCurrencyDestination);
        etCurrency1 = (EditText) findViewById(R.id.etCurrencySurce);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }
    @Override
    protected void onStart() {
        super.onStart();
        spCurrencyDestination.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
                double sourceCurreny = 0;
                try{
                    sourceCurreny = Double.parseDouble(etCurrency1.getText().toString());
                }catch (Exception e){
                }
                switch (i){
                    case 0:
                        if(spCurrencySource.getFirstVisiblePosition() == 0){
                            tvResult.setText(""+(sourceCurreny*1));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 1){
                            tvResult.setText(""+(sourceCurreny*68.10));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 2){
                            tvResult.setText(""+(sourceCurreny*0.014));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 3){
                            tvResult.setText(""+(sourceCurreny*1.67));
                        }
                        break;
                    case 1:
                        if(spCurrencySource.getFirstVisiblePosition() == 0){
                            tvResult.setText(""+(sourceCurreny*68.10));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 1){
                            tvResult.setText(""+(sourceCurreny*1));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 2){
                            tvResult.setText(""+(sourceCurreny*0.94));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 3){
                            tvResult.setText(""+(sourceCurreny*114.06));
                        }
                        break;
                    case 2:
                        if(spCurrencySource.getFirstVisiblePosition() == 0){
                            tvResult.setText(""+(sourceCurreny*72.17));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 1){
                            tvResult.setText(""+(sourceCurreny*1.06));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 2){
                            tvResult.setText(""+(sourceCurreny*1));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 3){
                            tvResult.setText(""+(sourceCurreny*120.91));
                        }
                        //Log.i("vinay", ""+i);
                        break;
                    case 3:
                        if(spCurrencySource.getFirstVisiblePosition() == 0){
                            tvResult.setText(""+(sourceCurreny*0.60));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 1){
                            tvResult.setText(""+(sourceCurreny*0.0088));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 2){
                            tvResult.setText(""+(sourceCurreny*0.0083));
                        }
                        if(spCurrencySource.getFirstVisiblePosition() == 3){
                            tvResult.setText(""+(sourceCurreny*1));
                        }
                        //Log.i("vinay", ""+i);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView adapterView) {
            }
        });
    }
}

