package com.example.inspiron3847desktop.ndksetup2.view;

import com.example.inspiron3847desktop.ndksetup2.data.Model;

/**
 * Created by Inspiron3847Desktop on 1/17/2018.
 */

public interface Contract {

    interface View {


        void updateDisplay(String output);
    }

    interface Presenter {


        void clickedNumber(int n);

        void clickedOperation(Model.Operation op);

        void updateDisplay(String output);
    }

}
