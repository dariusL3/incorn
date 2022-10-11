import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  createTransaction(data: string, myTime: number): Promise<string>;
  createConvertTx(data: string, myTime: number): Promise<string>;
  newKeySetFromPrivate(data: string): Promise<string>;
  decryptCoin(data: string): Promise<string>;
  createCoin(data: string): Promise<string>;
  generateBLSKeyPairFromSeed(data: string): Promise<string>;
  generateKeyFromSeed(data: string): Promise<string>;
  getSignPublicKey(data: string): Promise<string>;
  hybridEncrypt(data: string): Promise<string>;
  hybridDecrypt(data: string): Promise<string>;
  scalarMultBase(data: string): Promise<string>;
  randomScalars(data: string): Promise<string>;
  signPoolWithdraw(data: string): Promise<string>;
  verifySign(data: string): Promise<boolean>;
  estimateTxSize(data: string): Promise<string>;
  setShardCount(data: string, shardNum: number): Promise<string>;
  generateBTCMultisigAddress(data: string): Promise<string>;
  createOTAReceiver(data: string): Promise<string>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('Incognitojs');
