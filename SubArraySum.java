int mSum = 0;
        int sSum = 0;
        for(int i = 0; i < K; i++){
            mSum += Arr.get(i);
        }
        sSum = mSum;
        for(int i = K; i < Arr.size(); i++){
            sSum = sSum - Arr.get(i - K) + Arr.get(i);
            mSum = Math.max(sSum, mSum);
        }
        return mSum;