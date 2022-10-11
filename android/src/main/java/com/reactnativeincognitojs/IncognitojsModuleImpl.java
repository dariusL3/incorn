package com.reactnativeincognitojs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import gomobile.Gomobile;

/**
 * This is where the module implementation lives
 * The exposed methods can be defined in the `turbo` and `legacy` folders
 */
public class IncognitojsModuleImpl  {
    public static final String NAME = "Incognitojs";
    static ExecutorService executorService = Executors.newCachedThreadPool();
    
    public static void createTransaction(String data, double myTime, Promise promise) {
        Double t = Double.valueOf(myTime);
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.createTransaction(data, t.intValue()));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void createConvertTx(String data, double myTime, Promise promise) {
        Double t = Double.valueOf(myTime);
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.createConvertTx(data, t.intValue()));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void newKeySetFromPrivate(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.newKeySetFromPrivate(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void decryptCoin(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.decryptCoin(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void createCoin(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.createCoin(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void generateBLSKeyPairFromSeed(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.generateBLSKeyPairFromSeed(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void generateKeyFromSeed(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.generateKeyFromSeed(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void hybridEncrypt(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.hybridEncrypt(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void hybridDecrypt(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.hybridDecrypt(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void scalarMultBase(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.scalarMultBase(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void randomScalars(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.randomScalars(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void getSignPublicKey(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.getSignPublicKey(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void signPoolWithdraw(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.signPoolWithdraw(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void verifySign(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.verifySign(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void estimateTxSize(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.estimateTxSize(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void setShardCount(String data, double shardNum, Promise promise) {
        Double t = Double.valueOf(shardNum);
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.setShardCount(data, t.intValue()));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void generateBTCMultisigAddress(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.generateBTCMultisigAddress(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }

    public static void createOTAReceiver(String data, Promise promise) {
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    promise.resolve(Gomobile.createOTAReceiver(data));
                } catch (Exception e) {
                    promise.reject(e.getMessage());
                }
            }
        });
    }
}
