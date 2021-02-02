package com.atguigu.test;

import com.atguigu.util.MD5Utils;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMD5 {

    @Test
    public void testMD5() {
        String res = MD5Utils.md5("123");
        System.out.println(res);
        //202cb962ac59075b964b07152d234b70
        //202cb962ac59075b964b07152d234b70
    }
    @Test
    public void testSpringSecurity(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123");
        System.out.println(encode);
        //$2a$10$.p.bMsGUBXjzVML.V7XJO.z6e6YOA1R.CKA1NaWSjTdXm5GA5lwBW
        //$2a$10$K033ofJsEAoHPQa2o9zTnOzhCnpJKbb2CX0SDPsDjN57GaVrm08nW
        boolean b = encoder.matches("123",
                "$2a$10$gH1dUHvS9TFNJ0msZeg6uOJjr4r6cyjo1bTcLIqUehvS3d4QUm0zC");
        System.out.println(b);
    }

}
