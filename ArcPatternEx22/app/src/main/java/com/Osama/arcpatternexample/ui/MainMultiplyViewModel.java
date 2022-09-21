package com.Osama.arcpatternexample.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.Osama.arcpatternexample.pojo.DataBase;
import com.Osama.arcpatternexample.pojo.NumberModel;

public class MainMultiplyViewModel extends ViewModel {

    public MutableLiveData<Integer> mMutableLiveData = new MutableLiveData<>();

    public void getMulResult() {
        NumberModel mNumberModel = getNumbersFromDataBase();
        int result = mNumberModel.getFirstNum() * mNumberModel.getSecondNum();

        mMutableLiveData.setValue(result);
    }

    private NumberModel getNumbersFromDataBase() {
        return new DataBase().getNumbers();
    }
}
