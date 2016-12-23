package com.tofugear.countrypicker;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import android.content.Intent;
import android.app.Activity;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tofugear.countrypicker.CountryPickerModule;

public class CountryPickerPackage implements ReactPackage {

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }


    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.asList();
    }


    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new CountryPickerModule(reactContext));

        return modules;
    }

}
