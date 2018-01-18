package com.example.inspiron3847desktop.ndksetup2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.inspiron3847desktop.ndksetup2.R;
import com.example.inspiron3847desktop.ndksetup2.data.Model;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Contract.View {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }


    private Contract.Presenter presenter;

    @BindView(R.id.sample_text)
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        presenter = new PresenterImpl(this);

    }


    @Override
    public void updateDisplay(String number) {
        textView.setText(number);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */


    @OnClick(R.id.button1)
    public void clickedOne(){
        presenter.clickedNumber(1);
    }


    @OnClick(R.id.button2)
    public void clickedTwo(){
        presenter.clickedNumber(2);
    }

    @OnClick(R.id.button3)
    public void clickedThree(){
        presenter.clickedNumber(3);
    }

    @OnClick(R.id.button4)
    public void clickedFour(){
        presenter.clickedNumber(4);
    }

    @OnClick(R.id.button5)
    public void clickedFive(){
        presenter.clickedNumber(5);
    }

    @OnClick(R.id.button6)
    public void clickedSix(){
        presenter.clickedNumber(6);
    }

    @OnClick(R.id.button7)
    public void clickedSeven(){
        presenter.clickedNumber(7);
    }

    @OnClick(R.id.button8)
    public void clickedEight(){
        presenter.clickedNumber(8);
    }

    @OnClick(R.id.button9)
    public void clickedNine(){
        presenter.clickedNumber(9);
    }

    @OnClick(R.id.button0)
    public void clickedZero(){
        presenter.clickedNumber(0);
    }


    @OnClick(R.id.buttonEqual)
    public void clickedEqual(){
        presenter.clickedOperation(Model.Operation.EQUALS);
    }


    @OnClick(R.id.buttonClear)
    public void clickedClear(){
        presenter.clickedOperation(Model.Operation.CLEAR);
    }


    @OnClick(R.id.buttonPlus)
    public void clickedPlus(){
        presenter.clickedOperation(Model.Operation.ADD);
    }


    @OnClick(R.id.buttonMinus)
    public void clickedMinus(){
        presenter.clickedOperation(Model.Operation.MINUS);
    }


    @OnClick(R.id.buttonMultiply)
    public void clickedMultiply(){
        presenter.clickedOperation(Model.Operation.MULTIPY);
    }


    @OnClick(R.id.buttonDivide)
    public void clickedDivide(){
        presenter.clickedOperation(Model.Operation.DIVIDE);
    }

}
