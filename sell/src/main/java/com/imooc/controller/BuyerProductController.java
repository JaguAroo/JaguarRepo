package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/*
 * Descriptions:买家商品
 * creat-time:2020-0904-11:10
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        resultVO.setCode(0);
        resultVO.setMsg("成功！");
        productVO.setCategoryName("热销榜");
        productVO.setCategoryType(1);
        productVO.setProductInfoVO(Arrays.asList(productInfoVO));
        resultVO.setData(Arrays.asList(productVO));

        return resultVO;
    }
}
