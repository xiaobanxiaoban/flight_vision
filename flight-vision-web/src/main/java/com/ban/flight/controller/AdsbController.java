package com.ban.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaoban on 2017/3/22.
 */
@Controller
@RequestMapping("adsb")
public class AdsbController {

	@RequestMapping("upload")
	public void upload(){
		System.out.println("fasdfasdf");
	}
}
