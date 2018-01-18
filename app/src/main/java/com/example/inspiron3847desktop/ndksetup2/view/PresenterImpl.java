package com.example.inspiron3847desktop.ndksetup2.view;

import android.util.Log;
import android.view.Display;

import com.example.inspiron3847desktop.ndksetup2.data.Model;


/**
 * Created by Inspiron3847Desktop on 1/17/2018.
 */

public class PresenterImpl implements Contract.Presenter {

    private Contract.View view;

    private boolean onSecond = false;
    private boolean opEntered = false;
    private boolean answered = false;

    private int number1;
    private int number2;

    private Model.Operation operation;

    private static final String TAG = PresenterImpl.class.getName();

    public PresenterImpl(Contract.View v){
        view = v;

    }

    @Override
    public void clickedNumber(int n) {
        if(answered){
            clickedOperation(Model.Operation.CLEAR);
        }
        if(!opEntered){
            number1 = number1*10 + n;
            updateDisplay(String.valueOf(number1));
        } else {
            number2 = number2 * 10 + n;
            updateDisplay(String.valueOf(number2));
            onSecond = true;
        }
    }

    @Override
    public void clickedOperation(Model.Operation op) {
        if(op.equals(Model.Operation.CLEAR)){
            onSecond = false;
            opEntered = false;
            number1 = 0;
            number2 = 0;
            answered = false;
            updateDisplay("");
        } else if(op.equals(Model.Operation.EQUALS)){
            if(onSecond){
                computeNumber();
                onSecond = false;
                opEntered = false;
                number2 = 0;
                answered = true;
                updateDisplay(String.valueOf(number1));
            }
        } else if(op.equals(Model.Operation.ADD)){
             if(onSecond){
                clickedOperation(Model.Operation.EQUALS);
            }
            operation = Model.Operation.ADD;
            opEntered = true;
        } else if(op.equals(Model.Operation.MINUS)){
            if(onSecond){
                clickedOperation(Model.Operation.EQUALS);
            }
            operation = Model.Operation.MINUS;
            opEntered = true;
        } else if(op.equals(Model.Operation.MULTIPY)){
            if(onSecond){
                clickedOperation(Model.Operation.EQUALS);
            }
            operation = Model.Operation.MULTIPY;
            opEntered = true;
        } else if(op.equals(Model.Operation.DIVIDE)){
            if(onSecond){
                clickedOperation(Model.Operation.EQUALS);
            }
            operation = Model.Operation.DIVIDE;
            opEntered = true;
        }
    }

    private void computeNumber(){

        if(operation.equals(Model.Operation.ADD)){
            number1 = Model.add(number1,number2);
            Log.d(TAG,number1 + "");
        } else if(operation.equals(Model.Operation.MINUS)){
            number1 = Model.minus(number1,number2);
        } else if(operation.equals(Model.Operation.MULTIPY)){
            number1 = Model.multiply(number1,number2);
        } else if(operation.equals(Model.Operation.DIVIDE)){
            if(number2==0){
                updateDisplay("Cannot divide by 0");
            } else {
                number1 = Model.divide(number1,number2);
            }
        }
    }


    @Override
    public void updateDisplay(String output) {
        view.updateDisplay(output);
    }


}
