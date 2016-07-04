package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

/**
 * Created by JeongHeon on 2016. 7. 4..
 */
@Controller
public class SampleController {
    private static  final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("doA")
    public void doA(){
        logger.info("\ndoA called.......");
    }

    @RequestMapping("doB")
    public void doB(){
        logger.info("\ndoB called.......");
    }

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg){
        logger.info("doC called..............");
        return "result";
    }

    @RequestMapping("/doD")
    public String doD(Model model){
        //make simple data
        ProductVO product = new ProductVO("Sample Product", 10000);
        logger.info("doD");
        model.addAttribute(product);
        return "productDetail";
    }

    @RequestMapping("/doE")
    public String doE(RedirectAttributes rttr){
        logger.info("doE called but redirect to /doF......");

        rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
        return "redirect:/doF";
    }

    @RequestMapping("/doF")
    public void  doF(String msg){
        logger.info("doF called......" + msg);
    }
}
