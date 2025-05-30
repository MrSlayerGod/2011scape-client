package com.jagex;

import java.math.BigInteger;

public class ClientConfig {
    public static boolean SKIP_HOST_CHECK = true;
    public static boolean DISABLE_LOBBY = true;
    public static final int RENDER_DISTANCE_MULTIPLIER = 2;
    public static final int FOG_DISTANCE_MULTIPLIER = 2;
    public static final BigInteger JS5_MODULUS = new BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16);
    public static BigInteger LOGIN_MODULUS = new BigInteger("a1129cdb79665ed39b10d09e8dcfbc373f7e0b8097b98b1ddc4762149734ce8ea6ce59f3b9d76b1bbe10ad30ff67f87232477d7d98cacff3bd0c309e49000452947bb04d5122fd5cb113ce197393b28ef8d27841e0f3584baf9cb3848ba3be11826457c73545953ee00b3dbcd456774392055ac1382b6e4e49e6aa2bf026a28d165e4a59e907e229c5e372f3e486d2044c030f6efcdaa9d5893ab0609ecd41d56aca5af36845158031ed98a1bcb68bea4f7eaf823e00402fc05571dc1c83d9417f0489ec0f986761a793ad2bc493281b917d572400588a4634503e20ba6518c7b9367d959ef7fa6249a11f032d1707ed84bf2cda0ca8960e97295234d65cc2e1", 16);
    public static BigInteger RSA_EXPONENT = new BigInteger("10001", 16);
    public static String HOST_ADDRESS = "http://127.0.0.1";
}
