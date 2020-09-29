package com.example.springes;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringEsApplicationTests {


    @Qualifier("getRestHighClient")
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    
    @Test
    void contextLoads() {

    }



    @Test
    void getEsClient(){
        System.out.println(restHighLevelClient);
    }
}
