package com.abtest.dao;

import com.abtest.domain.CtrainABTestName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 9/17/17.
 */
public class CtrainABTestNameDAOTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ctrainABTestNameDAOTest() throws Exception{
        CtrainABTestNameDAO ctrainABTestNameDAO=new CtrainABTestNameDAO();
        try {
            List<CtrainABTestName> res=ctrainABTestNameDAO.query("select * from abTest where exnum='170324_tra_wfp'");
            System.out.println(res.size());
            for (int i=0;i<res.size();i++){
                System.out.println(res.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}