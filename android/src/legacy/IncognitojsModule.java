package com.reactnativeincognitojs;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class IncognitojsModule extends ReactContextBaseJavaModule {
  public static final String NAME = IncognitojsModuleImpl.NAME;

  IncognitojsModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return IncognitojsModuleImpl.NAME;
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    IncognitojsModuleImpl.multiply(a, b, promise);
  }
}
