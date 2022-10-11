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

  // See https://reactnative.dev/docs/native-modules-android
  
  @ReactMethod
  public void createTransaction(String data, double myTime, Promise promise) {
    IncognitojsModuleImpl.createTransaction(data, myTime, promise);
  }

  @ReactMethod
  public void createConvertTx(String data, double myTime, Promise promise) {
    IncognitojsModuleImpl.createConvertTx(data, myTime, promise);
  }

    @ReactMethod
  public void newKeySetFromPrivate(String data, Promise promise) {
    IncognitojsModuleImpl.newKeySetFromPrivate(data, promise);
  }

    @ReactMethod
  public void decryptCoin(String data, Promise promise) {
    IncognitojsModuleImpl.decryptCoin(data, promise);
  }

    @ReactMethod
  public void createCoin(String data, Promise promise) {
    IncognitojsModuleImpl.createCoin(data, promise);
  }
  
    @ReactMethod
  public void generateBLSKeyPairFromSeed(String data, Promise promise) {
    IncognitojsModuleImpl.generateBLSKeyPairFromSeed(data, promise);
  }

    @ReactMethod
  public void generateKeyFromSeed(String data, Promise promise) {
    IncognitojsModuleImpl.generateKeyFromSeed(data, promise);
  }
  
    @ReactMethod
  public void getSignPublicKey(String data, Promise promise) {
    IncognitojsModuleImpl.getSignPublicKey(data, promise);
  }
  
    @ReactMethod
  public void hybridEncrypt(String data, Promise promise) {
    IncognitojsModuleImpl.hybridEncrypt(data, promise);
  }

    @ReactMethod
  public void hybridDecrypt(String data, Promise promise) {
    IncognitojsModuleImpl.hybridDecrypt(data, promise);
  }
  
    @ReactMethod
  public void scalarMultBase(String data, Promise promise) {
    IncognitojsModuleImpl.scalarMultBase(data, promise);
  }
  
    @ReactMethod
  public void randomScalars(String data, Promise promise) {
    IncognitojsModuleImpl.randomScalars(data, promise);
  }
  
    @ReactMethod
  public void signPoolWithdraw(String data, Promise promise) {
    IncognitojsModuleImpl.signPoolWithdraw(data, promise);
  }

    @ReactMethod
  public void verifySign(String data, Promise promise) {
    IncognitojsModuleImpl.verifySign(data, promise);
  }
  
    @ReactMethod
  public void estimateTxSize(String data, Promise promise) {
    IncognitojsModuleImpl.estimateTxSize(data, promise);
  }
  
    @ReactMethod
  public void setShardCount(String data, double shardNum, Promise promise) {
    IncognitojsModuleImpl.setShardCount(data, shardNum, promise);
  }

    @ReactMethod
  public void generateBTCMultisigAddress(String data, Promise promise) {
    IncognitojsModuleImpl.generateBTCMultisigAddress(data, promise);
  }
  
    @ReactMethod
  public void createOTAReceiver(String data, Promise promise) {
    IncognitojsModuleImpl.createOTAReceiver(data, promise);
  }
}
