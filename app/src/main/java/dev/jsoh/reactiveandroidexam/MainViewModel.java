package dev.jsoh.reactiveandroidexam;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<Integer> count = new MutableLiveData<>();

    public MainViewModel() {
        count.setValue(0);
    }

    public void addCount() {
        count.setValue(count.getValue() + 1);
    }

    public void subCount() {
        count.setValue(count.getValue() - 1);
    }

}
