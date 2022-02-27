package com.mjj.service;

import com.mjj.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    public void queryAllByLimit() {
//        System.out.println(userService.queryAll().size());

//        Product product = productService.queryById(1);
//        byte[] image = product.getImage();
//
//
//        response.setContentType("image/jpeg");
//        response.setCharacterEncoding("UTF-8");
//        OutputStream os = response.getOutputStream();
//        InputStream in = new ByteArrayInputStream(image);
//        int len =0;
//        byte[] buf =new byte[1024];
//        while ((len = in.read(buf,0,1024)) != -1){
//            os.write(buf,0,len);
//        }
//        os.close();


        System.out.println();
    }

    @Test
    public void test1(){
        Date date=new Date(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}