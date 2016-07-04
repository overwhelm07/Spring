package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

/**
 * Created by JeongHeon on 2016. 7. 4..
 */
@Controller
public class SampleController5 {
    @RequestMapping("doJSON")
    public
    @ResponseBody
    ProductVO doJSON() {
        ProductVO vo = new ProductVO("샘플상품", 30000);

        return vo;
    }
}
