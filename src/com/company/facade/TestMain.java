package com.company.facade;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: small yellow
 * @Date: 2021/08/14/0:17
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Fund fund = new Fund();
        // 购买基金
        fund.buyFund();

        // 等待一段时间
        System.out.println("等待中......");
        Thread.sleep(200);


        // 售出基金
        fund.sellFund();

        //股票1买入
        //股票2买入
        //股票3买入
        //债券1买入
        //房地产1买入
        //等待中......
        //股票1售出
        //股票2售出
        //股票3售出
        //债券1售出
        //房地产1售出
    }
}
