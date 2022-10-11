package com.reactnativeincognitojs;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class IncognitojsModule extends NativeIncognitojsSpec {
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
  @Override
  @ReactMethod
  public void createTransaction(String data, double myTime, Promise promise) {
    IncognitojsModuleImpl.createTransaction(data, myTime, promise);
  }

  @Override
  @ReactMethod
  public void createConvertTx(String data, double myTime, Promise promise) {
    IncognitojsModuleImpl.createConvertTx(data, myTime, promise);
  }

  @Override
  @ReactMethod
  public void newKeySetFromPrivate(String data, Promise promise) {
    IncognitojsModuleImpl.newKeySetFromPrivate(String data, Promise promise);
  }

  @Override
  @ReactMethod
  public void decryptCoin(String data, Promise promise) {
    IncognitojsModuleImpl.decryptCoin(String data, Promise promise);
  }

  @Override
  @ReactMethod
  public void createCoin(String data, Promise promise) {
    IncognitojsModuleImpl.createCoin(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void generateBLSKeyPairFromSeed(String data, Promise promise) {
    IncognitojsModuleImpl.generateBLSKeyPairFromSeed(String data, Promise promise);
  }

  @Override
  @ReactMethod
  public void generateKeyFromSeed(String data, Promise promise) {
    IncognitojsModuleImpl.generateKeyFromSeed(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void getSignPublicKey(String data, Promise promise) {
    IncognitojsModuleImpl.getSignPublicKey(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void hybridEncrypt(String data, Promise promise) {
    IncognitojsModuleImpl.hybridEncrypt(String data, Promise promise);
  }

  @Override
  @ReactMethod
  public void hybridDecrypt(String data, Promise promise) {
    IncognitojsModuleImpl.hybridDecrypt(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void scalarMultBase(String data, Promise promise) {
    IncognitojsModuleImpl.scalarMultBase(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void randomScalars(String data, Promise promise) {
    IncognitojsModuleImpl.randomScalars(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void signPoolWithdraw(String data, Promise promise) {
    IncognitojsModuleImpl.signPoolWithdraw(String data, Promise promise);
  }

  @Override
  @ReactMethod
  public void verifySign(String data, Promise promise) {
    IncognitojsModuleImpl.verifySign(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void estimateTxSize(String data, Promise promise) {
    IncognitojsModuleImpl.estimateTxSize(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void setShardCount(String data, double shardNum, Promise promise) {
    IncognitojsModuleImpl.setShardCount(String data, Integer shardNum, Promise promise);
  }

  @Override
  @ReactMethod
  public void generateBTCMultisigAddress(String data, Promise promise) {
    IncognitojsModuleImpl.generateBTCMultisigAddress(String data, Promise promise);
  }
  
  @Override
  @ReactMethod
  public void createOTAReceiver(String data, Promise promise) {
    IncognitojsModuleImpl.createOTAReceiver(String data, Promise promise);
  }
}
