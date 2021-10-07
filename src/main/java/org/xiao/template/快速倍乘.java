package org.xiao.template;

import org.junit.Test;

public class 快速倍乘 {

    @Test
    public void test() {
        System.out.println(mul(2445,92));
    }

    static long mul(long a, long k){
        long ans = 0;
        while (k > 0){
            if ((k & 1) == 1){
                ans += a;
            }
            k >>= 1;
            a += a;
        }
        return ans;
    }
}
