package org.sanjay.lld.design.problems.ratelimiter.algo;

public class TokenBucket {
    private final long maxBucketSize;
    private final long refillRate;
    private double currentBucketSize;
    private long lastRefillTimestamp;

    public TokenBucket(long maxBucketSize, long refillRate, double currentBucketSize) {
        this.maxBucketSize = maxBucketSize;
        this.refillRate = refillRate;
        this.currentBucketSize = currentBucketSize;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean allowRequest(int tokens) {
        refill();

        if(currentBucketSize > tokens) {
            currentBucketSize -= tokens;
            return true;
        }
        return false;
    }

    private void refill() {
        long now = System.nanoTime();
        double tokensToAdd = (now - lastRefillTimestamp) * refillRate / 1e9;
        currentBucketSize = Math.min(currentBucketSize + tokensToAdd , maxBucketSize);
        lastRefillTimestamp = now;
    }
}
